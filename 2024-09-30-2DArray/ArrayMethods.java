//1. Write both your names + emails at the top of the document as a comment.
//Serena Chen; schen65@stuy.edu
//Raymond Chen; rchen60@stuy.edu

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
public static String arrToString2(int[][]ary){
  String result = "[";
  for (int i = 0; i < ary.length; i++) {
    result += arrToString(ary[i]);
    if (i < ary.length - 1) {
      result += ", ";
    }
  }
  //this should use arrToString(int[])
  return result + "]";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
  return null;//place holder return value so it compiles.
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}

public static void main(String[] args) {
  // arrToString for 2D array test cases
  int[][] testArray = new int[][];
  System.out.println("Expected [[]], result: " + arrToString2(testArray));

  testArray = int[2][];
  System.out.println("Expected [[], []], result: " + arrToString2(testArray));

  testArray = int {{1, 2, 3, 4}, {5, 6, 7, 8}};
  System.out.println("Expected [[1, 2, 3, 4], [5, 6, 7, 8]], result: " + arrToString2(testArray));

  testArray = int {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
  System.out.println("Expected [[1, 2, 3, 4], [5, 6], [7, 8, 9]], result: " + arrToString2(testArray));
}
