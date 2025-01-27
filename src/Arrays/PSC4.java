package Arrays;

public class PSC4 {
    static int kthSmallest(int[] arr,int k) {
        // Your code here
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        int kth=arr[k-1];
        return kth;

    }
    public static void main(String[] args) {
        int[]arr={7, 10, 4, 3, 20, 15};//7
        int k=3;
      int ans1=  kthSmallest(arr,3);
        System.out.println(ans1);
        int[]arr1={2, 3, 1, 20, 15};//15
        int k1=4;
        int ans2=kthSmallest(arr1,k1);
        System.out.println(ans2);
    }
}
