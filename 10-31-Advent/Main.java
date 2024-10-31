import java.util.Scanner;

public class Main {
  public static void main (String[] args) {

    Scanner sc = new Scanner("Some String (or File) Here");
    Scanner sc1 = new Scanner("This is a bunch of words");
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    double sum = 0;

    while(sc1.hasNext()) {
      System.out.println(sc1.next());
    }
    while (sc2.hasNext()) {
      sum += sc2.nextDouble();
    }
    System.out.println(sum);

  }
}
