package Sort.BubbleSort;
/// this is question  where we use the bubble sort algorithm and set all the zero at the end of the array
/// key point the loop second loop is iterate arr.length-i-1; which means the last  element is always sorted so is any operation perform on the last element then use the bubble sort
public class Problem1 {
    static  int[] sortedIn(int[]arr){
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 & arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                return arr;
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
