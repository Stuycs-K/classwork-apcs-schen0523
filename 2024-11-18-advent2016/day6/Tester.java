import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
  public static void main (String[] args) {

    System.out.println(getNewCode("input.txt"));
  }
  public static String getCode(String filename) {
    ArrayList<Integer> position0 = new ArrayList<Integer>();
    zeroes(position0);
    ArrayList<Integer> position1 = new ArrayList<Integer>();
    zeroes(position1);
    ArrayList<Integer> position2 = new ArrayList<Integer>();
    zeroes(position2);
    ArrayList<Integer> position3 = new ArrayList<Integer>();
    zeroes(position3);
    ArrayList<Integer> position4 = new ArrayList<Integer>();
    zeroes(position4);
    ArrayList<Integer> position5 = new ArrayList<Integer>();
    zeroes(position5);
    ArrayList<Integer> position6 = new ArrayList<Integer>();
    zeroes(position6);
    ArrayList<Integer> position7 = new ArrayList<Integer>();
    zeroes(position7);
    String current = "";
    String code = "";


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
        position6.set(current.charAt(6) -'a', position6.get(current.charAt(6) -'a') + 1);
        position7.set(current.charAt(7) -'a', position7.get(current.charAt(7) -'a') + 1);

      }
      code += Character.toString(position0.indexOf(Largest(position0)) + 97);
      code += Character.toString(position1.indexOf(Largest(position1)) + 97);
      code += Character.toString(position2.indexOf(Largest(position2)) + 97);
      code += Character.toString(position3.indexOf(Largest(position3)) + 97);
      code += Character.toString(position4.indexOf(Largest(position4)) + 97);
      code += Character.toString(position5.indexOf(Largest(position5)) + 97);
      code += Character.toString(position6.indexOf(Largest(position6)) + 97);
      code += Character.toString(position7.indexOf(Largest(position7)) + 97);
      input.close();
      return code;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }

  public static int Largest(ArrayList<Integer> arr) {
    int largest = 0;
    for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i) > largest) {
            largest = arr.get(i);
        }
    }
    return largest;
  }
  public static void zeroes(ArrayList<Integer> arr) {
    for(int i = 0; i < 26; i++) {
        arr.add(0);
    }
  }

  public static int Smallest(ArrayList<Integer> arr) {
    int smallest = 26;
    for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i) < smallest && arr.get(i) != 0) {
            smallest = arr.get(i);
        }
    }
    return smallest;
  }

  public static String getNewCode(String filename) {
    ArrayList<Integer> position0 = new ArrayList<Integer>();
    zeroes(position0);
    ArrayList<Integer> position1 = new ArrayList<Integer>();
    zeroes(position1);
    ArrayList<Integer> position2 = new ArrayList<Integer>();
    zeroes(position2);
    ArrayList<Integer> position3 = new ArrayList<Integer>();
    zeroes(position3);
    ArrayList<Integer> position4 = new ArrayList<Integer>();
    zeroes(position4);
    ArrayList<Integer> position5 = new ArrayList<Integer>();
    zeroes(position5);
    ArrayList<Integer> position6 = new ArrayList<Integer>();
    zeroes(position6);
    ArrayList<Integer> position7 = new ArrayList<Integer>();
    zeroes(position7);
    String current = "";
    String code = "";


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
        position6.set(current.charAt(6) -'a', position6.get(current.charAt(6) -'a') + 1);
        position7.set(current.charAt(7) -'a', position7.get(current.charAt(7) -'a') + 1);

      }
      code += Character.toString(position0.indexOf(Smallest(position0)) + 97);
      code += Character.toString(position1.indexOf(Smallest(position1)) + 97);
      code += Character.toString(position2.indexOf(Smallest(position2)) + 97);
      code += Character.toString(position3.indexOf(Smallest(position3)) + 97);
      code += Character.toString(position4.indexOf(Smallest(position4)) + 97);
      code += Character.toString(position5.indexOf(Smallest(position5)) + 97);
      code += Character.toString(position6.indexOf(Smallest(position6)) + 97);
      code += Character.toString(position7.indexOf(Smallest(position7)) + 97);
      input.close();
      return code;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }

  



}
