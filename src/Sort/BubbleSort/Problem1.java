package Sort.BubbleSort;

public class Problem1 {
    static  int[] sortedIn(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 & arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;                }
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int []arr={0,5,0,2,0,1,2};
        int []ans=sortedIn(arr);
        for(int x :ans){
            System.out.print(x+" ");
        }
    }
}
