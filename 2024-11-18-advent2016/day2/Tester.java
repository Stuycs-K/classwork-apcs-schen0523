import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {
  public static void main (String[] args) {

    System.out.println(getNewCode("input.txt"));
  }
  public static String getCode(String filename) {
    String code = "";
    String directions = "";
    int button = 5;

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
        directions = input.nextLine();
        for(int i = 0; i < directions.length(); i++) {
            String current = String.valueOf(directions.charAt(i));
            if (current.equals("D") && button < 7) {
                button += 3;
            }
            if (current.equals("L") && (button != 1) && (button != 4) && (button !=7) ) {
                button -= 1;
            }
            if (current.equals("R") && (button != 3) && (button != 6) && (button !=9)) {
                button += 1;
            }
            if (current.equals("U") && button > 3) {
                button -= 3;
            }
        }
        code += button;
        
      }

      input.close();
      return code;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }

  }


  public static String getNewCode(String filename) {
    String code = "";
    String directions = "";
    int button = 5;

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
        directions = input.nextLine();
        for(int i = 0; i < directions.length(); i++) {
            String current = String.valueOf(directions.charAt(i));
            if (current.equals("D") && (button !=5) && (button !=10) && (button !=13) && (button !=12) && (button !=9)) {
                if ((button == 2) || (button == 6) || (button == 4) || (button == 8) || (button == 3) || (button == 7)) {
                    button += 4;
                }
                else if ((button == 1) || (button == 11) ) {
                    button += 2;
                }
            }
            if (current.equals("L") && (button != 1) && (button != 2) && (button !=5) && (button !=10) && (button !=13)) {
                button -= 1;
            }
            if (current.equals("R") && (button != 1) && (button != 4) && (button !=9) && (button !=12) && (button !=13)) {
                button += 1;
            }
            if (current.equals("U") && (button !=5) && (button !=2) && (button !=1) && (button !=4) && (button !=9)) {
                if ((button == 10) || (button == 6) || (button == 12) || (button == 8) || (button == 11) || (button == 7)) {
                    button -= 4;
                }
                else if ((button == 13) || (button == 3) ) {
                    button -= 2;
                }
            }
        }
        if (button == 10) {
            code += "A";
        }
        else if(button == 11) {
            code += "B";
        }
        else if(button == 12) {
            code += "C";
        }
        else if(button == 13) {
            code += "D";
        }
        else {
            code += button;
        }
        
      }

      input.close();
      return code;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }

  }


  



}
