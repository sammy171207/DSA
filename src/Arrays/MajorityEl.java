package Arrays;

public class MajorityEl {
    static int max(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static  int  malel(int[]arr){
         int max=max(arr);
         int[] countarr=new int[max+1];
         for(int i=0;i<arr.length;i++){
             countarr[arr[i]]++;
         }
         int k=0;
        int a=arr.length/2;
         for(int x:countarr){
             if(x>a){
                return k;
             }
             k++;
         }
         return -1;
    }
    public static void main(String[] args) {
        int []arr={7};

         int els= malel(arr);
        System.out.println(els);
    }
}
