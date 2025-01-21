package Sort.MergeSort;

public class Basic {
    static void mergeSort(int []arr,int l, int r){
        if(l>=r) return;
        int mid=Math.abs(l+r/2);
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
    }
    public static void main(String[] args) {
   int []arr={4,1,3,5,2};
   int n=arr.length;

    }
}
