package String;

import java.util.ArrayList;
import java.util.List;

public class SSQ1 {
     static List<String>ssq(String str){
         List<String> ans=new ArrayList<>();
         for(int i=0;i<str.length();i++){
             for(int j=i+1;j<str.length();j++){
                 ans.add(str.substring(i,j));
             }
         }
         return ans;
     }


    public static void main(String[] args) {
        String str="sameer";
        List<String> substrings = ssq(str);
        System.out.println(substrings);
    }
}
