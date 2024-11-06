import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main (String[] args) {
    //System.out.println(isTri(5, 5, 2));
    System.out.println(countTrianglesA("inputTri.txt"));
  }

  public static int countTrianglesA(String filename) {
    int counter = 0;
    int x, y, z = 0;
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
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
    

}
