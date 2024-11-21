import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

/*public class Tester {
  public static void main (String[] args) {
    //System.out.println(getNewCode("input.txt"));
    String testRoom = "aaaaa-bbb-z-y-x-123[abxyz]";
    System.out.println(isrealRoom(testRoom));
  }

  public static int getSum(String filename) {
    int sum = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
        current = input.nextLine();
        if(isRealRoom(current)) {
          sum += returnID(current);
        }
      }
      input.close();
      return sum;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }

  public static int returnID (String room) {
    int id = 0;
    String idS = room.substring(room.lastIndexOf("-")+1, room.indexOf("["));
    id = Integer.parseInt(idS);
    return id;
  }

  public static boolean isRealRoom(String room) {
    String checksum = room.substring(room.indexOf("[") + 1, room.indexOf("]"));
    String name = room.substring(0, room.lastIndexOf("-"));
    ArrayList<Integer> occurence = zeroes(26);
    String[] nameSplit = name.split("-");
    for(int i = 0; i < nameSplit.length;i++) {
      for (int j = 0; j < nameSplit[i].length(); j++) {
        occurence.set(occurence.charAt(j) -'a', occurence.get(occurence.charAt(j) - 'a') + 1);
      }
    }
    ArrayList<Integer> sortedOccurence = Collections.sort(occurence);
    int[] sortedA = new int[5];
    sortedA[0] = sortedOccurence.get(occurence.size()-1);
    sortedA[1] = sortedOccurence.get(occurence.size()-2);
    sortedA[2] = sortedOccurence.get(occurence.size()-3);
    sortedA[3] = sortedOccurence.get(occurence.size()-4);
    sortedA[4] = sortedOccurence.get(occurence.size()-5);
    //check if the letters in checksum are the 5 most common letters
    //create new int array containing the top 5 values of occurence
    for(int k = 0; k < checksum.length(); k++) {
      for(int a = 0; a < 5; a++) {
        if (sorted[a] != occurence(checksum.charAt(k)-'a'))
      }
    }
    return true;

  }

  public static ArrayList<Integer> zeroes(int length) {
    //returns an arrayList with length 0s
    Arraylist<Integer> arr = new ArrayList<Integer>();
    for(int i = 0; i < length; i++) {
        arr.add(0);
    }
  }







}*/

public class Tester {
    public static void main(String[] args) {


      System.out.println(codeA("input.txt"));
      System.out.println(codeB("input.txt"));

    }

    public static int codeA(String filename) {
      int[] arr = new int[26];  // Array to store frequency of characters (a-z)
        String result = "";

      //CODE THAT SCANS THE FILE.
        int sum = 0;
        try {
          File file = new File(filename);
          Scanner sc = new Scanner(file);

          while(sc.hasNext()) {
            String l = "";
            String line = sc.nextLine();
            int i = 0;
            while (i < line.length()) {
              char c = line.charAt(i);
              if (Character.isLetter(c)) {
                  int index = c - 'a';
                  arr[index]++;
              }
              if(c=='[') {
                break;
              }
              i++;
          }
          for(int j = 0; j < 5; j++) {
            int max = 0;
          for(int ii = 0; ii < 26; ii++) {
            if(arr[ii]>arr[max]) {
              max = ii;
            }
          }
          arr[max]=0;
          String x = Character.toString ((char) max+97);
          l+=x;
          }
          if(l.equals(line.substring(line.length()-6,line.length()-1))) {
            String clean = line.replaceAll("\\D+","");
            int o = Integer.parseInt(clean);

            sum+=o;
          }
          for(int im = 0; im < 26; im++) {
            arr[im] = 0;
          }
      }
      sc.close();  // Close scanner

      return sum;  // Return the result



          }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }
  }

public static String rot26(char x, int y) {
    int z = x + y;
    if(z>122) {
      z-=26;
    }
    if(z>('z'+26)) {
      return Character.toString ((char) z-26);
    }
    return Character.toString ((char) z);
}

    public static int codeB(String filename) {
        int sum = 0;
        
        try {
          File file = new File(filename);
          Scanner sc = new Scanner(file);

          while(sc.hasNext()) {
            String l = "";
            String line = sc.nextLine();
            String clean = line.replaceAll("\\D+","");
            int o = Integer.parseInt(clean);
            o = o % 26;
            for(int i = 0; i < line.length();i++) {
              if(Character.isLetter(line.charAt(i))) {
                l += rot26(line.charAt(i),o);
                } 
              else if(line.charAt(i) == '-') {
                l+= " ";
              }
              else if(line.charAt(i) == '[') {
                l+= " ";
              }
              else {
                l+= line.charAt(i);
              }
            }
            //System.out.println(l);
            String[] arr = l.split(" ");
            sum += Integer.parseInt(arr[arr.length-2]);
            
          }
          return sum;

        } catch (FileNotFoundException ex) {
            //File not found what should you do?
            System.out.println("File not found");
            return 0; //you can return from a void function just don't put a value.
        }
      }

    }
