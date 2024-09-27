public class MyArrays {
  public static void main (String[] args) {
    //test case for arrayToString
    int [] testArray1 = new int[]{1, 2, 3};
    System.out.println(arrayToString(testArray1));

    //test cases for returnCopy

    //test cases for concatArray


  }
  public static String arrayToString (int[] nums) {
    String result = "[";
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
      if (i < nums.length - 1) {
        result += ", ";
      }
    }
    return result + "]";
  }




}
