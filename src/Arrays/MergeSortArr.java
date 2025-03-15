package Arrays;
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
public class MergeSortArr {
    static  int[]mergeSort(int[]n1,int[]n2,int m, int n){
        int i=0,j=0;
        int []temp=new int[m+n];
        int k=0;
        while(i<m && j<n){
             if(n1[i]<n2[j]){
                 temp[k++]=n1[i++];
             }else{
                 temp[k++]=n2[j++];
             }
        }
        while (i<m){
            temp[k++]=n1[i++];
        }
        while (j<n){
            temp[k++]=n2[j++];
        }
        return  temp;
    }
    public static void main(String[] args) {
     int[]n1={1,2,3,0,0,0};
     int[]n2={2,5,6};
        int []result=mergeSort(n1,n2,3,3);
        for(int x:result){
            System.out.print(x+" ");

        }
    }
}
