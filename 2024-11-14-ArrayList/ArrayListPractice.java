import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> arrayList = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int rand = (int)(11 * Math.random());
      String randString = "";
      if (rand != 0) {
        randString = "" + rand;
      }
      arrayList.add(randString);
    }
    return arrayList;
  }

  public static void replaceEmpty(ArrayList<String> original) {
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i,"Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original) {
    ArrayList<String> newList = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--) {
      newList.add(original.get(i));
    }
    return newList;
  }
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
    ArrayList<String> shorter = a;
    ArrayList<String> longer = b;
    ArrayList<String> newArr = new ArrayList<String>();
    if (b.size() < a.size()) {
        shorter = b;
    }
    if (shorter.equals(a)) {
        longer = b;
    } else {
        longer = a;
    }
    for (int i = 0; i < shorter.size(); i++) {
        newArr.add(a.get(i));
        newArr.add(b.get(i));
    }
    for (int i = shorter.size(); i < longer.size(); i++) {
        newArr.add(longer.get(i));
    }
        return newArr;

  } 
  public static void main(String[] args) {

    //System.out.println(createRandomArray(200000));

    ArrayList<String> test1 = createRandomArray(20);
    replaceEmpty(test1);
    System.out.println(test1);

    test1 = createRandomArray(10);
    System.out.println(test1);
    System.out.println(makeReversedList(test1));

    test1 = createRandomArray(15000);
    ArrayList<String> test2 = createRandomArray(10000);
    System.out.println(test1);
    System.out.println(test2);
    System.out.println(mixLists(test1, test2));

  }
}