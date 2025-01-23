package Sort.BubbleSort;

public class ZeroOnceSec {
    static void  zero12(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        zero12(arr);
    }
}
