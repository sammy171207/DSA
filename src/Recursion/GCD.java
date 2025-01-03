package Recursion;

import java.util.Scanner;

public class GCD {
    static  int igcd(int x,int y){
        while (x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    static  int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        int a=igcd(x,y);
        System.out.println(a +" normal way");
        int b=gcd(x,y);
        System.out.println(b+ " recursion way");
    }
}
