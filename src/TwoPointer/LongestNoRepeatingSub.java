package TwoPointer;

import java.util.HashSet;
import java.util.Set;

public class LongestNoRepeatingSub {
    static int length(String str){
        int max_Length=Integer.MIN_VALUE;
        Set<Character>set1=new HashSet<>();
        int left=0;
        for(int right=0;right<str.length();right++){
            while (set1.contains(str.charAt(right))){
                set1.remove(str.charAt(left));
                left++;
            }
            set1.add(str.charAt(right));
            max_Length=Math.max(max_Length,right-left+1);
        }
        return  max_Length;
    }
    public static void main(String[] args) {
         String str="cadbzabcd";
        System.out.println(length(str));
    }
}
