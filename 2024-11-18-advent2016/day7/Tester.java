import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
  public static void main (String[] args) {

    System.out.println(countIPsB("input.txt"));
    /*String test = "onnnswceyplyloumr[ltgljgpirbbxlub]kbxkwhdbzatkbumifjb[vhomgfzdjrwbzguyl]xujmkylyebnochax[fqfilhjsiphqmzmn]fpzchuqdipzcqpvcz";
    ArrayList<String> bracket = new ArrayList<String>();
    outsideBrackets(test, bracket);
    System.out.println(bracket);*/
    //String test1 = "gfeybddby";
    //System.out.println(isABBA(test1));
    //String test2 = "zazbz";
    //System.out.println(ABAList(test2));
  }

  public static int countIPs(String filename) {
    int count = 0;

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      

      while(input.hasNextLine()) {
        ArrayList<String> bracketI = new ArrayList<String>();
        ArrayList<String> bracketO = new ArrayList<String>();
        String inputIP = input.nextLine();
        insideBrackets(inputIP, bracketI);
        //System.out.println(bracketI);
        outsideBrackets(inputIP, bracketO);

        boolean inBracket = false;
        boolean outBracket = false;
        for(int k = 0; k < bracketI.size(); k++) {
            if (isABBA(bracketI.get(k))) {
                inBracket = true;
                k = bracketI.size();
            }
        }
        for(int j = 0; j < bracketO.size(); j++) {
            if (isABBA(bracketO.get(j))) {
                outBracket = true;
                j = bracketO.size();
            }
        }
        if(!inBracket && outBracket) {
            count += 1;
        }
       
      }

      input.close();
      return count;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
    

  }
  public static void insideBrackets(String IP, ArrayList<String> result) {
    if (IP.indexOf("[") != -1 && IP.indexOf("]") != -1) {
      result.add(IP.substring(IP.indexOf("[")+1, IP.indexOf("]")));
      insideBrackets(IP.substring(IP.indexOf("]") +1), result);
    }
  }
   public static void outsideBrackets(String IP, ArrayList<String> result) {
    if (IP.indexOf("[") == IP.lastIndexOf("[") && IP.indexOf("]") == IP.lastIndexOf("]")) {
        result.add(IP.substring(0, IP.indexOf("[")));
        result.add(IP.substring(IP.indexOf("]") + 1));
    }
    else if (IP.indexOf("[") != -1 && IP.indexOf("]") != -1) {
      result.add(IP.substring(0, IP.indexOf("[")));
      outsideBrackets(IP.substring(IP.indexOf("]") +1), result);
    }
  }
  public static boolean isABBA(String str) {
    for(int i =0; i <= str.length()-4; i++) {
        String section = "";
        if (i == str.length() - 4) {
            section = str.substring(i);
        }
        else {
            section = str.substring(i, i+4);
        }

        if (section.charAt(0) == section.charAt(3) && section.charAt(1) == section.charAt(2) && section.charAt(0) != section.charAt(1)) {
            return true;
        }

    }
    return false;

  }

  public static int countIPsB(String filename) {
    int count = 0;

    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      

      while(input.hasNextLine()) {
        ArrayList<String> bracketI = new ArrayList<String>();
        ArrayList<String> bracketO = new ArrayList<String>();
        ArrayList<String> ABAbracketI = new ArrayList<String>();
        ArrayList<String> ABAbracketO = new ArrayList<String>();
        String inputIP = input.nextLine();
        insideBrackets(inputIP, bracketI);
        //System.out.println(bracketI);
        outsideBrackets(inputIP, bracketO);
        //System.out.println(bracketO);

        //both arraylists contain all aba values
        ABAList(bracketI, ABAbracketI);
        //System.out.println(ABAbracketI);
        ABAList(bracketO, ABAbracketO);
        //System.out.println(ABAbracketO);
        for(int a = 0; a < ABAbracketO.size(); a++) {
          String original = ABAbracketO.get(a);
          String opposite = "";
          opposite += original.charAt(1);
          opposite += original.charAt(0);
          opposite += original.charAt(1);
          if (ABAbracketI.indexOf(opposite) != -1) {
            count++;
          }
        }
       
      }

      input.close();
      return count;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }

  //given a str, make an arraylist containg all the aba pairs
  //given an arraylist containg strings
  public static void ABAList(ArrayList<String> content, ArrayList<String> pairs) {
    for(int j = 0; j < content.size(); j++) {
      String str = content.get(j);
      for(int i =0; i <= str.length()-3; i++) {
        String section = "";
        if (i == str.length() - 3) {
            section = str.substring(i);
        }
        else {
            section = str.substring(i, i+3);
        }

        if (section.charAt(0) == section.charAt(2) && section.charAt(1) != section.charAt(0) ) {
            pairs.add(section);
        }
      }
    }

  }


}
