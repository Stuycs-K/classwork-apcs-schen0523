import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
  public static void main (String[] args) {
    System.out.println(getNewCode("input.txt"));
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
        occurence.set(current.charAt(j) -'a', occurence.get(current.charAt(j) - 'a') + 1);
      }
    }
    //check if the letters in checksum are the 5 most common letters
    //create new int array containing the top 5 values of occurence
    for(int k = 0; k < checksum.length(); k++) {
      if (occurence.get(checksum.charAt(k) - 'a') not in newArray) {
        return false;
      }  //get ascii value -97 to get corresponding value in occurence
    }
    return true;

  }

  public static ArrayList<Integer> zeroes(int length) {
    //returns an arrayList with length 0s
    Arraylist<Integer> arr = new ArrayList<Integer>;
    for(int i = 0; i < length; i++) {
        arr.add(0);
    }
  }







}
