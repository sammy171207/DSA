package Sort.BubbleSort.SelectionSort;

public class Basic {
    static  int minMum(int[]arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
              if(arr[i]<min){
                  min=arr[i];
              }
        }
        return min;
    }

    static void swap(int i,int k){
        int temp=i;
        k=i;
        k=temp;
    }
    static int[]selectionsort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={6,4,5,3,9,2,1};
      int[]ans=  selectionsort(arr);
        for(int x:ans){
            System.out.print(x+":");
        }
    }
}
