package Recursion;

public class SOD {
    static int sumofDigit(int n){
       if(n<=9) return  n;
       return sumofDigit(n/10)+(n%10);
    }
    public static void main(String[] args) {
       int ans= sumofDigit( 1234);
        System.out.println("Sum of Digit : "+ans);
    }
}
