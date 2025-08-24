package Top15.String;

import java.util.Arrays;

public class LCPrefix {
    static  String longcommonprefix(String []s1){
      String prefix=s1[0];

      for(int i=1;i<s1.length;i++){
           prefix=commonString(prefix,s1[i]);
           if(prefix.isEmpty())break;
      }
      return prefix;
    }
    static  String commonString(String s1,String s2){
        int i=0;
        while(i<s1.length() && i<s2.length() && s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return  s1.substring(0,i    );
    }
    public static void main(String[] args) {
        String []str={"flower","flow","flight"};
        String []str1={"dog","racecar","car"};
        System.out.println(longcommonprefix(str));
    }
}
