package Arrays;

public class Kadane_Algo {
   static int maxSubarraySum(int[] arr) {
       int maxvalue=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
          for(int j=i;j<arr.length;j++){
              int sum=0;
              for(int k=i;k<=j;k++){
                  sum+=arr[k];
                  if(maxvalue<sum){
                      maxvalue=sum;
                  }
              }
          }
      }
       return maxvalue;
    }

    static int optimalop(int[]arr){
       int maxSoFar=arr[0];
       int maxEndingHere=arr[0];
       for(int i=0;i<arr.length;i++){
           maxEndingHere=Math.max(arr[i],maxEndingHere+arr[i]);
           maxSoFar=Math.max(maxSoFar,maxEndingHere);
       }
       return maxSoFar;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
//               maxSubarraySum(arr);
//               int arr1[]={-2, -4};
//               maxSubarraySum(arr1);
//               int arr2[]={5, 4, 1, 7, 8};
//               maxSubarraySum(arr2);
        int ans=optimalop(arr);
        System.out.println(ans);
    }
}
