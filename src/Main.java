
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner shub=new Scanner(System.in);
        String s=shub.nextLine();

        char[] ch=s.toCharArray();
        shub.nextLine();
        int n=shub.nextInt();


        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c>='a' && c<='z' || c>='A'&&c<='Z'||c>='0'&&c<='9'){
                System.out.print((char)(c+n));
            }else{
                System.out.print(c);
            }
        }
    }
}

