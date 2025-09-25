import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main (String[] args) {
    //System.out.println(isTri(5, 5, 2));
    //System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

  public static int countTrianglesA(String filename) {
    int counter = 0;
    int x, y, z = 0;

    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      while(input.hasNextInt()) {
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if (isTri(x, y, z)) {
          counter++;
        }
      }

      input.close();
      return counter;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }

  }

  public static boolean isTri(int a, int b, int c) {
    return (a + b > c && a + c > b && b + c > a);
  }

  public static int countTrianglesB(String filename) {
    int row, column = 0;
    int counter = 0;
    int x1, x2, x3, y1, y2, y3, z1, z2, z3 = 0;

    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      while(input.hasNextInt()) {
        x1 = input.nextInt();
        x2 = input.nextInt();
        x3 = input.nextInt();
        y1 = input.nextInt();
        y2 = input.nextInt();
        y3 = input.nextInt();
        z1 = input.nextInt();
        z2 = input.nextInt();
        z3 = input.nextInt();
        if (isTri(x1, y1, z1)) {
          counter++;
        }
        if (isTri(x2, y2, z2)) {
          counter++;
        }
        if (isTri(x3, y3, z3)) {
          counter++;
        }
      }

      input.close();
      return counter;

    } catch (FileNotFoundException ex) {
      
      System.out.println("File not found");
      return 0;
    }
  }

}
