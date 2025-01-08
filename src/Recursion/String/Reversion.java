package Recursion.String;

public class Reversion {
    static  String reverseString(String a,int idx){
        if(idx==a.length()){
            return " ";
        }
        String ans=reverseString(a,idx+1)+a.charAt(idx);
        return ans;
    }
    public static void main(String[] args) {
        String s="abcd";
      String out=  reverseString(s,0);
        System.out.println(out);

    }
}
