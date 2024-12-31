package Recursion;

public class DecIncOrder {
    static void  DecreasingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n);
        DecreasingOrder(n-1);
    }

    static void  IncreasingOrder(int n){
       if(n==1){
           System.out.print(1);
           return;
       }
       IncreasingOrder(n-1);
       System.out.print(n);
    }

    public static void main(String[] args) {
        System.out.println("Decreasing Order :");
     DecreasingOrder(5);
        System.out.println("Increasing Order :");
     IncreasingOrder(5);
    }
}
