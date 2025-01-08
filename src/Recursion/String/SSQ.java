package Recursion.String;

import java.util.ArrayList;

public class SSQ {
    //s=abc
    static ArrayList<String> order(String s){
        ArrayList<String>ans=new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String>smallans=order(s.substring(1));
        for(String ss:smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String>ans=new ArrayList<>();
      ans= order("abc");
        System.out.println(ans);
    }
}

