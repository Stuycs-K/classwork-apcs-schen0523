import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {

  public static void main (String[] args) {
    System.out.println(distanceB("input.txt"));
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

  /*public static int revisit (String filename) {
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
              int[] arrV = new int[vertical];
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
*/
  public static int distanceB(String filename) {
        int Lsum = 0;
        int Rsum = 0;
  
        try {
          File file = new File(filename);
          Scanner sc = new Scanner(file);
          ArrayList xList = new ArrayList<String>();
          ArrayList yList = new ArrayList<String>();
          
        //CODE THAT SCANS THE FILE.
        int heading = 0;
  
  
        while(sc.hasNext()) {
        String a = sc.next();
        char direction = a.charAt(0);
        a=a.replaceAll(",", "");
        int b = Integer.parseInt(a.substring(1));
        if(direction=='R') {
          heading = (heading + 1) % 4;
        }
        else {
          heading = (heading - 1 + 4) % 4;
        }

        for (int i = 0; i < b; i++) {
            // Update coordinates based on the current heading
            if (heading == 0) { // North
                Rsum++;
            } else if (heading == 1) { // East
                Lsum++;
            } else if (heading == 2) { // South
                Rsum--;
            } else if (heading == 3) { // West
                Lsum--;
            }

            // Check if this position has already been visited
            for(int j = 0; j < xList.size(); j++) {
                if(((int) xList.get(j))==Lsum && ((int)yList.get(j))==Rsum) {
                                 return Math.abs(Lsum)+Math.abs(Rsum);
                         }
            }

            // Add the current position to the lists
            xList.add(Lsum);
            yList.add(Rsum);
        }
    }

        }
  catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return -1; //you can return from a void function just don't put a value.
      }
      return -1;
    }
}

