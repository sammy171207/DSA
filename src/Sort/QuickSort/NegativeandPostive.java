package Sort.QuickSort;

import static Sort.QuickSort.Basic.swap;

public class NegativeandPostive {
    static  void divp2n(int[]arr,int start,int end){
        if(start>=end) return;
        int pvt=partitio(arr,start,end);
        divp2n(arr,start,pvt-1);
        divp2n(arr,pvt+1,end);
    }

    static int partitio(int []arr, int start, int end){
        int pivot=arr[start];
        int cnt=0;
        for(int i=start+1;i<arr.length;i++){
            if(arr[i]<pivot){
                cnt++;
            }
        }
        int pvtindex=start+cnt;
        swap(arr,start,pvtindex);
        int i=start ;
        int j=end;

        while (i<=pvtindex && j>pvtindex){
              while (arr[i]<pivot)i++;
              while (arr[j]>pivot)j--;
              if(i<pvtindex && j >pvtindex){
                  swap(arr,i,j);
                  i++;
                  j--;
              }
        }
        return pvtindex;
    }
    public static void main(String[] args) {
        int []arr={19,-20,7,-4,-13,11,-5,3};
        divp2n(arr,0,arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
