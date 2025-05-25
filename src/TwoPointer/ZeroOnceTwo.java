package TwoPointer;

public class ZeroOnceTwo {

    static void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] sortArr(int[]arr){
        int left=0,right=arr.length-1,mid=0;
        while(mid<=right){
            swap(left,mid,arr);
            if(arr[mid]==0){
             left++;
             mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                swap(mid,right,arr);
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={2,0,2,1,1,0};
       int []sort= sortArr(arr);
        for(int i=0;i<sort.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
