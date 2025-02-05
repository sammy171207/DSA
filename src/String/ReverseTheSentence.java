package String;

import java.io.CharConversionException;
import java.util.Stack;

public class ReverseTheSentence {
    static  String reverseWords(String str){
        StringBuilder ans=new StringBuilder();
        str.trim();
        String[]arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]);
        }
       return ans.toString().trim();

    }
    public static void main(String[] args) {
    String str="_i_like_this_program_very_much_";
//      reverseWords(str);

        Stack<String>st=new Stack<>();

    }
}
