import java.util.Arrays;
public class Driver {

  public static void main (String[] args) {
    System.out.print(CLEAR_SCREEN);
    System.out.print(HIDE_CURSOR);

    //System.out.println(Arrays.toString(makeRandomArray(10)));

    //prints out the border
    
    for(int i = 1; i < 31; i++) {
      if (i == 1 || i == 30) {
        //print whole row
        go(i,1);
        for(int j = 0; j < 79; j++) {
          System.out.print(MAGENTA);
          System.out.print(LIGHTBLUE);
          System.out.print("*");
        }
        System.out.print(LIGHTBLUE+"*");
        System.out.print(RESET);
        System.out.println("");
      }
      else if (i == 2){
        go(i,1);
        System.out.print(CYAN);
        System.out.print(LIGHTBLUE+"#");
        System.out.print(RESET);
        int[] randArr = makeRandomArray(3);
        //first number
        go(i,20);
        if(randArr[0]<25) {
          color(RED,BRIGHT);
          System.out.print("" + randArr[0]);
        }
        else if(randArr[0]>75) {
          color(GREEN,BRIGHT);
          System.out.print("" + randArr[0]);
        }
        else {
          color(WHITE);
          System.out.print("" + randArr[0]);
        }
        //second number
        go(i,40);
        if(randArr[1]<25) {
          color(RED,BRIGHT);
          System.out.print("" + randArr[1]);
        }
        else if(randArr[1]>75) {
          color(GREEN,BRIGHT);
          System.out.print("" + randArr[1]);
        }
        else {
          color(WHITE);
          System.out.print("" + randArr[1]);
        }
        //third number
        go(i,60);
        if(randArr[2]<25) {
          color(RED,BRIGHT);
          System.out.print("" + randArr[2]);
        }
        else if(randArr[2]>75) {
          color(GREEN,BRIGHT);
          System.out.print("" + randArr[2]);
        }
        else {
          color(WHITE);
          System.out.print("" + randArr[2]);
        }
        go(i, 80);
        System.out.print(CYAN);
        System.out.print(LIGHTBLUE+"#");
        System.out.print(RESET);
        System.out.println("");
      }
      else if (i == 3) {
        go(i,1);
        System.out.print(CYAN);
        System.out.print(LIGHTBLUE+"#");
        System.out.print(RESET);
        go(i,2);
        for(int j = 0; j < 78; j++) {
          System.out.print(MAGENTA);
          //System.out.print(LIGHTBLUE);
          System.out.print("-");
        }
        System.out.print(CYAN);
        System.out.print(LIGHTBLUE+"#");
        System.out.print(RESET);
        System.out.println("");
      }
      else {
        //print only beginning and end
        //System.out.print(i);
        go(i,1);
        System.out.print(CYAN);
        System.out.print(LIGHTBLUE+"#");
        System.out.print(RESET);
        go(i, 80);
        System.out.print(CYAN);
        System.out.print(LIGHTBLUE+"#");
        System.out.print(RESET);
        System.out.println("");
        
      }
    }
    go(31,1);
    System.out.print(RESET);
    System.out.print(SHOW_CURSOR);

    
  

  }

  public static final String LIGHTBLUE = "\u001b[48;5;195m";
  public static final String MAGENTA = "\u001b[35;1m";
  public static final String CYAN = "\u001b[36;1m";
  public static final String RESET = "\u001b[0m";
  public static final int BRIGHT = 1;
  public static final int RED = 31;
  public static final int GREEN = 32; 
  public static final int WHITE = 37;
  public static final String CLEAR_SCREEN =  "\033[2J";
  public static final String HIDE_CURSOR =  "\033[?25l";
  public static final String SHOW_CURSOR =  "\033[?25h";

  public static void go(int row,int col){
    System.out.print("\033[" + row + ";" + col + "H");
}

  public static int[] makeRandomArray(int len) {
    int[] result = new int[len];
    for(int i = 0; i < len; i++) {
      int rand = (int)(100 * Math.random());
      result[i] = rand;
    }
    return result;
  }

  //Overloarded color commands (give 1 or more colors/modifiers)
  public static void color(int m){
    System.out.print ("\033[;" + m + "m");
  }
  public static void color(int m1, int m2){
    System.out.print ("\033["+ m1 + ";" + m2 + "m");
  }
  public static void color(int m1, int m2, int m3){
    System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
  }
  public static void color(int m1, int m2, int m3, int m4){
    System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
  }

  public static int  background(int color){
  return color + 10;
  }

}
