import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {

  public static void main (String[] args) {
    System.out.println(revisit("input.txt"));
  }

  public static int blocksAway (String filename) {
    ArrayList<String> directions = new ArrayList<String>(4);
    directions.add("North");
    directions.add("East");
    directions.add("South");
    directions.add("West");

    int i = 0;
    int vertical = 0;
    int horizontal = 0;
    String d = "";
    int step = 0;
    String currentD = "North";
    
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
        String direction = input.nextLine();
        String[] arr = direction.split(", ");
        for(int j = 0; j < arr.length; j++) {
          direction = arr[j];
          d = String.valueOf(direction.substring(0,1));
          step = Integer.parseInt(direction.substring(1));
        
          if (d.equals("R")) {
            i++;
          }
          else {
           i--;
          }
          if (i == -1) {
            i = 3;
          }
          if (i == 4) {
            i = 0;
          }

          currentD = directions.get(i);

          if (currentD.equals("North")) {
            vertical += step;
          }
          else if (currentD.equals("South")) {
            vertical -= step;
          }
          else if (currentD.equals("East")) {
            horizontal += step;
          }
          else {
            horizontal -= step;
          }
        }

      }

      input.close();
      return Math.abs(vertical) + Math.abs(horizontal);

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static int revisit (String filename) {
    ArrayList<String> directions = new ArrayList<String>(4);
    ArrayList<Integer> pastVisitsV = new ArrayList<Integer>();
    ArrayList<Integer> pastVisitsH = new ArrayList<Integer>();
    directions.add("North");
    directions.add("East");
    directions.add("South");
    directions.add("West");

    int i = 0;
    int vertical = 0;
    int horizontal = 0;
    String d = "";
    int step = 0;
    String currentD = "North";
    
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()) {
        String direction = input.nextLine();
        String[] arr = direction.split(", ");
        for(int j = 0; j < arr.length; j++) {
          direction = arr[j];
          d = String.valueOf(direction.substring(0,1));
          step = Integer.parseInt(direction.substring(1));
        
          if (d.equals("R")) {
            i++;
          }
          else {
           i--;
          }
          if (i == -1) {
            i = 3;
          }
          if (i == 4) {
            i = 0;
          }

          currentD = directions.get(i);

          if (currentD.equals("North")) {
            vertical += step;
          }
          else if (currentD.equals("South")) {
            vertical -= step;
          }
          else if (currentD.equals("East")) {
            horizontal += step;
          }
          else {
            horizontal -= step;
          }

          
          
          if (pastVisitsH.size() > 1) {
            for (int k = 0; k < pastVisitsH.size()-1; k++) {
              int[] arrH = new int[horizontal]
              for(int r = 0; r < horizontal; i++) {
                arrH[r] = r;
              }
              int[] arrV = new int[vertical]
              for(int s = 0; s < vertical; i++) {
                arrH[s] = s;
              }
              for(int q = 0; q < )

              for (int q = 0; q < horizontal; q++) {
                if (pastVisitsH.get(q) == horizontal && pastVisitsV.get(q) == vertical ) {
                
                return Math.abs(horizontal) + Math.abs(horizontal);
              }
              }
              
            
            }
          }
          pastVisitsH.add(horizontal);
          pastVisitsV.add(vertical);
          

          

        }

      }

      input.close();
      return Math.abs(vertical) + Math.abs(horizontal);

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }
}

