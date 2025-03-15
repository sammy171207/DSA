package String;

import java.util.Scanner;

public class StringCompression {
    static  String comps(String word){
        StringBuilder str=new StringBuilder();
        int cnt=1;int n=word.length();
        char ch=word.charAt(0);
        for(int i=1;i<n;i++){
            if(word.charAt(i)==ch && cnt<9){
            cnt++;
            }
            else{
                str.append(cnt).append(ch);
                cnt=1;
                ch=word.charAt(i);
            }
        }
        str.append(cnt).append(ch);


        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();//abcdecdeab
        System.out.println(comps(s));
    }
}
