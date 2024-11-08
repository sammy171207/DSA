package String;

import java.util.Scanner;

public class CircularSentence {
    static boolean check(String s){
        String []words=s.split(" ");
        if(words.length==1) return true;
        for(int i=0;i<words.length;i++){
             if(words[i].charAt(words[i].length()-1) != words[(i+1) % words.length].charAt(0) ){
                 return false;
             }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean ok=check(s);
        System.out.println(ok);
    }
}
