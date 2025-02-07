package Sort.CoutSort;

public class SortZeroOnceTwo {
    static  void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void optimalapp(int[]arr){
        int low=0; int mid=0;int hi=arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }
    }

    static void basicApproach(int []arr){
        int freqarr[]=new int[3];
        for(int i=0;i<arr.length;i++){
            freqarr[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<freqarr.length;i++){
            for(int j=0;j<freqarr[i];j++){
                 arr[k++]=i;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,0,1,0,2,1,1,2};
        basicApproach(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
