package Recursion;

public class MultipleofNumber {

    static  void   mulitple(int n,int k){
        //base case
        if(k==1){
            System.out.print(n );
            return;
        }mulitple(n,k-1);
        System.out.print(n*k);
    }
    public static void main(String[] args) {
          mulitple(2,5);
    }
}
