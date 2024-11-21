import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.util.Scanner;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Tester {
  public static void main (String[] args) throws NoSuchAlgorithmException {

        
  }
  }


  /*public static String getNewCode(String filename) {
    String current = "";
    String code = "";


    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
        current = input.nextLine();
        
      }
      input.close();
      return;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }*/
public static String getMd5(String input)
    {
        try {

                String str = "";
        String base = "uqwqemis";
        for(int i = 0; str.length()<8; i++) {
            base += i;
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            String lll = sj.getMD5Hash(data);
            if(lll.substring(0, 5).equals("00000")) {
                str += lll.charAt(i);
            }
            base = "uqwqemis";
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
  



}
