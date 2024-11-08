package String;

import java.util.Scanner;

public class ReverseString {
    static  String  rev(String s){
        StringBuilder ans=new StringBuilder();
        String []words=s.split("\\.");
        for(int i= words.length-1;i>=0;i--){
            if(i==0){
                ans.append(words[i]);
            }
            else{
            ans.append(words[i]+'.');
            }

        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(rev(s));
    }
}
