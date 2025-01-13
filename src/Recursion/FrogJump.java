package Recursion;

public class FrogJump {
    static  int opApproach(int []arr,  int n,int idx){
        if(idx==n-1){
            return 0;
        }
        int opt1=Math.abs(arr[idx]-arr[idx+1])+opApproach(arr,n,idx+1);
        if(idx==n-2){
            return opt1;
        }
        int op2=Math.abs(arr[idx]-arr[idx+2])+opApproach(arr,n,idx+2);
        return Math.min(opt1,op2);
    }
    public static void main(String[] args) {
        int [] h={10,30,40,20};
        System.out.println(opApproach(h,h.length,0));
    }
}
