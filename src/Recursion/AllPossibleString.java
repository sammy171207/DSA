package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPossibleString {

static void allPossible(int idx,String str,String current,List<String>result){
    if(idx==str.length()){
        result.add(current);
    }
    allPossible(idx+1,str,current+str.charAt(idx),result);
    allPossible(idx+1,str,current,result);
}


    public static void main(String[] args) {
        String str="abc";
        List<String>li=new ArrayList<>();
        allPossible(0,str,"",li);
        for(String s:li){
            System.out.println(s);
        }

    }
}
