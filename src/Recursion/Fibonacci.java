package Recursion;

public class Fibonacci {

    static  int  factorial(int n){
        if(n==0) return 1;
        int smallans=factorial(n-1);
        return n*smallans;
    }

    static  int fibonaci(int n){
        if(n==0 || n==1)return n;
        //base problem
        return fibonaci(n-1)+fibonaci(n-2);
    }

    public static void main(String[] args)  {

        int o= factorial(5);
        System.out.println("Factorial Number :"+o);
        int fab=fibonaci(5);
        System.out.println("Fibonacci Number : "+fab);
    }
}
