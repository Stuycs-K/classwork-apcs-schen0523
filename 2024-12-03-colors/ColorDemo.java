public class ColorDemo {

  public static void main(String[] args) {
    // System.out.print("\u001b[31m");
    // System.out.println("Hello World");

    // System.out.print("\u001b[31mRed");
    // System.out.print(" fish ");
    // System.out.print("\u001b[34mBlue");
    // System.out.print(" fish ");
    // System.out.print(" also blue because no reset... also your terminal is blue now too...");

    /*for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
      System.out.println();
    }*/

    String[][] heart = new String[][]{
      {LIGHTBLUE, "               "},
      {LIGHTBLUE,"  ", PINK1 , " ",LIGHTBLUE, " ", PINK1 , " ",LIGHTBLUE, "  "},
      {LIGHTBLUE,"", PINK2 , "           ",LIGHTBLUE, ""},
      {PINK3 , "   ", PINK2 , "     ", PINK3 , "   "},
      {PINK3 , "   ", PINK2 , "     ", PINK3 , "   "},
      {LIGHTBLUE,"", PINK2 , "           ",LIGHTBLUE, ""},
      {LIGHTBLUE, "  ", PINK1 , "       ",LIGHTBLUE, "  "},
      {LIGHTBLUE, "    ", PINK1 , "   ",LIGHTBLUE, "    "},
      {LIGHTBLUE,"               "}
    };

    System.out.print(CLEAR_SCREEN);
    for (int row = 0; row < heart.length; row++) {
      for (int col = 0; col < heart[row].length; col++) {
        System.out.print(heart[row][col] + " ");
      }

      System.out.println("\u001b[0m");
    }
  }

  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static int blue = 34;
  public static int magenta = 35;
  public static int cyan = 36;
  public static int white = 37;

  public static final String PINK1 = "\u001b[48;5;13m"; 
  public static final String PINK2 = "\u001b[48;5;205m"; 
  public static final String PINK3 = "\u001b[48;5;206m"; 
  public static final String LIGHTBLUE = "\u001b[48;5;195m";

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }


}
