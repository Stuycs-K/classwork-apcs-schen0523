//1. Write both your names + emails at the top of the document as a comment.
//Serena Chen; schen65@stuy.edu
//Raymond Chen; rchen60@stuy.edu

public class ArrayMethods {
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
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

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
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
    return sum;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
  public static int[][] swapRC(int[][]nums){
    int [][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++) {
      for (int j = 0; j < nums.length; j++) {
        result[i][j] = nums[j][i];
      }
    }
    return result;
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
    return newAry;//placeholder so it compiles
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

  public static void main(String[] args) {
    //arrToString for 2D arrays test cases
    int[][] testArray = new int[2][4];
    System.out.println("expected: [[0, 0], [0, 0, 0, 0]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[2][0];
    System.out.println("expected: [[], []]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};
    System.out.println("expected: [[1, 2, 3, 4], [5, 6, 7, 8]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[][] {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
    System.out.println("expected: [[1, 2, 3, 4], [5, 6], [7, 8, 9]]");
    System.out.println("result: " + arrToString(testArray));

    //arr2DSum test cases
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

    //swapRC test cases
    testArray = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]");
    System.out.println("result: " + arrToString(swapRC(testArray)));

    testArray = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};
    System.out.println("expected: [[1, 5], [2, 6], [3, 7], [4, 8]]");
    System.out.println("result: " + arrToString(swapRC(testArray)));

    //replaceNegative test cases
    testArray = new int[][] {{1, -2, 3}, {4, -5, 6}, {7, -8, -9}};
    replaceNegative(testArray);
    System.out.println("expected: [[1, 0, 3], [4, 1, 6], [7, 0, 1]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    replaceNegative(testArray);
    System.out.println("expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]");
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

    //copy test cases
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
    

  }

}
