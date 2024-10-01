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
      if (ary[i] == null) {
        result += "null";
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
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
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

  public static void main(String[] args) {
    //arrToString for 2D arrays test cases
    int[][] testArray = new int[2][4];
    System.out.println("expected: [[0, 0], [0, 0, 0, 0]]");
    System.out.println("result: " + arrToString(testArray));

    testArray = new int[2][];
    System.out.println("expected: [null, null]");
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

    //arr2DSum test cases
    testArray = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]");
    System.out.println("result: " + arrToString(swapRC(testArray)));

    testArray = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};
    System.out.println("expected: [[1, 5], [2, 6], [3, 7], [4, 8]]");
    System.out.println("result: " + arrToString(swapRC(testArray)));

  }

}
