package String;

public class LargestOddNumberSubString {
    static String largestString(String str){
      for(int i=str.length()-1;i>=0;i--){
          char ch=str.charAt(i);
          if((ch-'0')%2!=0){
              System.out.println(str.substring(0,i+1));
             return str.substring(0,i+1);
          }
      }
      return "";
    }
    public static void main(String[] args) {
        String num="52";
        String num1="4206";
        String num3="35427";
        System.out.println(largestString(num));

    }
}

