import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    //test cases for arrayToString (2d arrays)
    int[][] testArray = new int[2][4];
    System.out.println("expected: " + Arrays.deepToString(testArray));
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[][] {{1, 2, 3}, {4, 5, 6}};
    System.out.println("expected: " + Arrays.deepToString(testArray));
    System.out.println("result: " + arrToString(testArray));

    //test cases for my arrayToString (1d arrays)
    int[] testArray1 = new int[2];
    System.out.println("expected: " + Arrays.toString(testArray1));
    System.out.println("result: " + arrToString(testArray1));

    testArray1 = new int[] {1, 2, 3, 4};
    System.out.println("expected: " + Arrays.toString(testArray1));
    System.out.println("result: " + arrToString(testArray1));

    //test cases for countZeros2D
    testArray = new int[][] {{1, 2, 3}, {4, 5, 6}};
    System.out.println("expected: 0");
    System.out.println("result: " + countZeros2D(testArray));

    testArray = new int[2][4];
    System.out.println("expected: 8");
    System.out.println("result: " + countZeros2D(testArray));

    testArray = new int[][] {{1, 2}, {0, 3, 0}, {4, 5, 6, 0}};
    System.out.println("expected: 3");
    System.out.println("result: " + countZeros2D(testArray));

    //test cases for arr2DSum
    testArray = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("expected: 45");
    System.out.println("result: " + arr2DSum(testArray));

    testArray = new int[][] {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
    System.out.println("expected: 45");
    System.out.println("result: " + arr2DSum(testArray));

    testArray = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};
    System.out.println("expected: 36");
    System.out.println("result: " + arr2DSum(testArray));

    testArray = new int[2][4];
    System.out.println("expected: 0");
    System.out.println("result: " + arr2DSum(testArray));

    testArray = new int[2][0];
    System.out.println("expected: 0");
    System.out.println("result: " + arr2DSum(testArray));

    //test cases for replaceNegative
    testArray = new int[][] {{1, -2, 3}, {4, -5, 6}, {7, -8, -9}};
    replaceNegative(testArray);
    System.out.println("expected: [[1, 0, 3], [4, 1, 6], [7, 0, 1]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[][] {{-1}, {-4, -5}, {-7, -8, -9}};
    replaceNegative(testArray);
    System.out.println("expected: [[1], [0, 1], [0, 0, 1]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[][] {{1, -2, 3, 4}, {-5, -6, 7, -8}};
    replaceNegative(testArray);
    System.out.println("expected: [[1, 0, 3, 4], [0, 1, 7, 0]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[2][0];
    replaceNegative(testArray);
    System.out.println("expected: [[]], []]");
    System.out.println("result: " + arrToString(testArray));

    //test cases for copy
    int [][] original = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    System.out.println("original array: " + arrToString(original));
    int [][] newcopy = copy(original);
    System.out.println("copy array: " + arrToString(newcopy));
    //checking to see if the values in the arrays match
    boolean result = true;
    for(int i = 0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        if (original[i][j] != newcopy[i][j]) {
          result = false;
          i = original.length;
          System.out.println("are the values the same? no");
        }
      }
    }
    if (result) {
      System.out.println("are the values the same? yes");
    }
    //modify one array to see if the other one changes as well
    original[0][0] = 1; 
    System.out.println("are the arrays the same? " + (original[0][0] == newcopy[0][0]));

    original = new int[][]{{0, 1, 2, 4}, {3, 4, 5, 6}};
    System.out.println("original array: " + arrToString(original));
    newcopy = copy(original);
    System.out.println("copy array: " + arrToString(newcopy));
    //checking to see if the values in the arrays match
    result = true;
    for(int i = 0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        if (original[i][j] != newcopy[i][j]) {
          result = false;
          i = original.length;
          System.out.println("are the values the same? no");
        }
      }
    }
    if (result) {
      System.out.println("are the values the same? yes");
    }
    //modify one array to see if the other one changes as well
    original[0][0] = 1; 
    System.out.println("are the arrays the same? " + (original[0][0] == newcopy[0][0]));

    original = new int[][]{{0}, {1, 2, 4}, {3, 4, 5, 6}};
    System.out.println("original array: " + arrToString(original));
    newcopy = copy(original);
    System.out.println("copy array: " + arrToString(newcopy));
    //checking to see if the values in the arrays match
    result = true;
    for(int i = 0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        if (original[i][j] != newcopy[i][j]) {
          result = false;
          i = original.length;
          System.out.println("are the values the same? no");
        }
      }
    }
    if (result) {
      System.out.println("are the values the same? yes");
    }
    //modify one array to see if the other one changes as well
    original[0][0] = 1; 
    System.out.println("are the arrays the same? " + (original[0][0] == newcopy[0][0]));
    

    //test cases for swapRC

    //test cases for htmlTable



  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    if (ary.length == 0) {
      return "[]";
    }
    for (int i = 0; i < ary.length; i++) {
      result += ary[i];

      if (i < ary.length - 1) {
        result += ", ";
      }
    }
    return result + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].length == 0) {
        result += "[]";
      }
      else {
      result += arrToString(ary[i]);
      }
      if (i < ary.length - 1) {
        result += ", ";
      }
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0 ) {
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i].length == 0) {
          sum += 0;
        }
      else {
          for (int j = 0; j < nums[i].length; j++) {
            sum += nums[i][j];
          }
        }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for(int i = 0; i < vals.length; i++) {
      if (vals[i].length != 0) {
        for (int j = 0; j < vals[i].length; j ++) {
          if (vals[i][j] < 0 && i == j) {
            vals[i][j] = 1;
          }
          else if (vals[i][j] < 0) {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] newAry = new int[nums.length][];
    if (nums.length != 0) {
      for (int i = 0; i < nums.length; i++) {
        newAry[i] = copy(nums[i]);
      }
    }
    return newAry;
  }
  //helper method, returns copy of a 1d array
  public static int[] copy(int[] ary) {
    int[] newAry = new int[ary.length];
    if (ary.length != 0) {
      for (int i = 0; i < ary.length; i++) {
        newAry[i] = ary[i];
      }
    }
    return newAry;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
