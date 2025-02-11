package Top15.String;

import java.util.HashSet;

public class isSubsequence {
  static boolean brute(String s, String t){
      int i=0;
      int j=0;
      while (i<s.length() && j<t.length()){
          if(s.charAt(i)==t.charAt(j)){
              i++;
          }
          j++;
      }
      return i == s.length();
  }
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        System.out.println(brute(s,t));

    }
}
