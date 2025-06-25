package Recursion;

public class PrintArrayRec {
    static void print(int []arr,int idx){
        //base case
        int n=arr.length;
        if(idx==n){
            System.out.println("");
            return ;
        }
        System.out.print(arr[idx]+"-");
        print(arr,idx+1);
    }

    static void  maxValue(int[]arr,int idx,int max){
        if(idx==arr.length){
            System.out.println("maximum value :"+max);
            return;
        }
        max=Math.max(arr[idx],max);
        maxValue(arr,idx+1,max);
    }

    static void sumOfArray(int []arr,int idx,int sum){
        if(idx==arr.length){
            System.out.println("Sum of element :"+sum);
            return ;
        }
        sum+=arr[idx];
        sumOfArray(arr,idx+1,sum);

    }

    static int power(int a, int b){
        if(b==0)return 1;
        if(b%2==0)
          return power(a, (int) Math.floor(b/2))*power(a,(int)Math.floor(b/2));
        else
            return a*power(a,(int)Math.floor(b/2))*power(a,(int)Math.floor(b/2));
    }
    public static void main(String[] args) {

    int [] arr={1,2,3,4,6,7};
    print(arr,0);
    maxValue(arr,0,0);
    sumOfArray(arr,0,0);
        System.out.println( power(2,5));

    }
}
