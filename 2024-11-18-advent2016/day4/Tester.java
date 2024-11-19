import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
  public static void main (String[] args) {
    System.out.println(getNewCode("input.txt"));
  }

  public static int getSum(String filename) {
    
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
        current = input.nextLine();
        position0.set(current.charAt(0) -'a', position0.get(current.charAt(0) -'a') + 1);
        position1.set(current.charAt(1) -'a', position1.get(current.charAt(1) -'a') + 1);
        position2.set(current.charAt(2) -'a', position2.get(current.charAt(2) -'a') + 1);
        position3.set(current.charAt(3) -'a', position3.get(current.charAt(3) -'a') + 1);
        position4.set(current.charAt(4) -'a', position4.get(current.charAt(4) -'a') + 1);
        position5.set(current.charAt(5) -'a', position5.get(current.charAt(5) -'a') + 1);
        //position6.set(current.charAt(6) -'a', position6.get(current.charAt(6) -'a') + 1);
        //position7.set(current.charAt(7) -'a', position7.get(current.charAt(7) -'a') + 1);

      }
      code += Character.toString(position0.indexOf(Largest(position0)) + 97);
      code += Character.toString(position1.indexOf(Largest(position1)) + 97);
      code += Character.toString(position2.indexOf(Largest(position2)) + 97);
      code += Character.toString(position3.indexOf(Largest(position3)) + 97);
      code += Character.toString(position4.indexOf(Largest(position4)) + 97);
      code += Character.toString(position5.indexOf(Largest(position5)) + 97);
      //code += Character.toString(position6.indexOf(Largest(position6)) + 97);
      //code += Character.toString(position7.indexOf(Largest(position7)) + 97);
      input.close();
      return code;

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
  }

  public static ArrayList<Integer> zeroes(int length) {
    //returns an arrayList with length 0s
    Arraylist<Integer> arr = new ArrayList<Integer>;
    for(int i = 0; i < length; i++) {
        arr.add(0);
    }
  }

 

  



}