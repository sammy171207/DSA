package TwoPointer;

public class SubArrayProductLessByK {
    static  int subArrayLessThenK(int[]arr,int k){
        int cnt=0,product=1,left=0;
         for(int right=0;right<arr.length;right++){
             product*=arr[right];
             while (product>=k){
                 product/=arr[left];
                 left++;
             }
             cnt+=1+(right-left);
         }
        return  cnt;
    }
    public static void main(String[] args) {
        int[]arr={10,5,2,6};
        int k=100;
        int ans=subArrayLessThenK(arr,k);
        System.out.println(ans);
        System.out.println("Done");
    }
}
