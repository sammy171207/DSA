package Recursion;

public class SOD {
    static int sumofDigit(int n){
       if(n<=9) return  n;
       return sumofDigit(n/10)+(n%10);
    }

    static  int countofDigit(int n){
        if(n<=9) return  1;
        return countofDigit(n/10)+1;
    }
   ///time complexity O(q) we can  reduce more
    static int powofTwoDigit(int p,int q){
        if(q==0) return 1;
        return  powofTwoDigit(p,q-1)*p;
    }
    // next approach
    static  int pow(int p, int q ){
        if(q==0) return  1;
        if(q%2==0){
           return pow(p,q/2)*pow(p,q/2);
        }
       return pow(p,q/2)*pow(p,q/2) *p;
    }

    public static void main(String[] args) {
       int ans= sumofDigit( 1234);
        System.out.println("Sum of Digit : "+ans);
        int count=countofDigit(1234);
        System.out.println("Count of digit :"+count);
        int sol=powofTwoDigit(2,4);
        System.out.println("Power of the two Digit :"+sol);

        int sol2=pow(2,4);
        System.out.println(sol2);
    }

}
