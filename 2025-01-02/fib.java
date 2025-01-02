public class fib{

  public static void main(String[] args) {

    System.out.println(fibs(Integer.parseInt(args[0])));
  }

  public static int fibs(int n) {
    if(n < 2) {
      return n;
    }
    else {
      return fibs(n-1) + fibs(n-2);
    }
  }
}
