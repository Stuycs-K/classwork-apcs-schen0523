public class MyArrays {
  public static void main (String[] args) {
    //test case for arrayToString
    int [] testArray1 = new int[]{1, 2, 3, 4};
    System.out.println(arrayToString(testArray1));
    testArray1 = new int[0];
    System.out.println(arrayToString(testArray1));

    //test cases for returnCopy
    int [] original = new int[]{0, 1, 2, 3, 4, 5};
    System.out.println("original array: " + arrayToString(original));
    int [] copy = returnCopy(original);
    System.out.println("copy array: " + arrayToString(copy));
    //checking to see if the values in the arrays match
    boolean result = true;
    for(int i = 0; i < original.length; i++) {
      if (original[i] != copy[i]) {
        result = false;
        i = original.length;
        System.out.println("are the values the same? no");
      }
    }
    if (result) {
      System.out.println("are the values the same? yes");
    }
    //modify one array to see if the other one changes as well
    original[0] = 1; 
    System.out.println("are the arrays the same? " + (original[0] == copy[0]));

    //test cases for concatArray
    int [] array1 = new int[]{1, 3, 5, 7};
    int [] array2 = new int[]{2, 4, 6, 8};
    int [] array3 = concatArray(array1, array2);
    System.out.println("array 1 : " + arrayToString(array1));
    System.out.println("array 2 : " + arrayToString(array2));
    System.out.println("combined array : " + arrayToString(array3));


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

  public static int[] returnCopy(int[] ary) {
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      newAry[i] = ary[i];
    }
    return newAry;
  }
  
  public static int[] concatArray (int[] ary1, int[] ary2) {
    return ary1;
  }




}
