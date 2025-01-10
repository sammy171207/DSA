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
        //recursive work
        ArrayList<String>smallans=order(s.substring(1));
        for(String ss:smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }

        return ans;
    }

    static void prindSSQ(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char currChar=s.charAt(0);
        String remString=s.substring(1);
        prindSSQ(remString,currAns+currChar);
        prindSSQ(remString,currAns);
    }
    public static void main(String[] args) {
//        ArrayList<String>ans=new ArrayList<>();
//      ans= order("abc");
//        System.out.println(ans);
        prindSSQ("abc"," ");

    }
}

