package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Occurence {
    static int firstOccurence(String txt, String pat) {
        return txt.indexOf(pat);

    }

    static char  firstrep(String str){
        LinkedHashSet<Character> set=new LinkedHashSet<>();
         for(int i=0;i<str.length();i++){
             for(int j=i+1;j<str.length();j++){
                 if(str.charAt(i)==str.charAt(j)){
                   set.add(str.charAt(i));
                 }
             }
         }
        if (!set.isEmpty()) {
            return set.iterator().next();
        } else {
            return '#';
        }
    }

    static char firstRep(String str) {
        HashSet<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;
            }
            seen.add(ch);
        }

        return '#';  // No repeating character found
    }
    public static void main(String[] args) {
  String str="geeksforgeeks";

        System.out.println(firstRep("geeksforgeeks")); // Output: g
        System.out.println(firstRep("abcdef"));        // Output: #
        System.out.println(firstRep("abca"));
    }
}
