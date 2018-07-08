package core;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class Encrypt {
        static Cipher cipher;
    public static String myMacAddress() throws IOException {
        String mac_address;
        String cmd_mac = "ifconfig en0";
        String cmd_win = "cmd /C for /f \"usebackq tokens=1\" %a in (`getmac ^| findstr Device`) do echo %a";

        if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) {
            mac_address = new Scanner(Runtime.getRuntime().exec(cmd_win).getInputStream()).useDelimiter("\\A").next().split(" ")[1];}
        else {mac_address = new Scanner(Runtime.getRuntime().exec(cmd_mac).getInputStream()).useDelimiter("\\A").next().split(" ")[4];}
        mac_address = mac_address.toLowerCase().replaceAll("-", ":");
        return mac_address;
    }
        public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
                String encryptedText = Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes()));
            return encryptedText;}

        public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            String decryptedText = new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText)));
            return decryptedText;}

        public static void main(String[] args) throws Exception {
            cipher = Cipher.getInstance("AES");
            String password = "";
            String key = myMacAddress();
            key = key.replaceAll("-", ":");  // 00-0c-29-3e-07-e6  =>  00:0c:29:3e:07:e6
            SecretKeySpec sk = new SecretKeySpec(Arrays.copyOf(key.getBytes("UTF-8"), 16), "AES");
            System.out.println("Password: \t" + password);
            System.out.println("MAC Address: \t" + key);
            String encryptedpassword = encrypt(password, sk);
            System.out.println("Encrypted: \t" + encryptedpassword);
            String decryptedpassword = decrypt(encryptedpassword, sk);
            System.out.println("Test: \t\t" + decryptedpassword);
        }

    }
