package Recursion;

public class GPRecursion {

    static int factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    static double gpSum(int idx,int r, int n,double sum){
        if(idx==n){
            return sum;
        }
       sum+=(1/Math.pow(r, idx));
        return gpSum(idx+1,r,n,sum);
    }




    public static void main(String[] args) {
//        int n =3;
//        int r=5;
////        double ans= gpSum(0,5,3,0);
////        System.out.println(ans);
        int x=4;
        int n=2;

    }
}
