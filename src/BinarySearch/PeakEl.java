package BinarySearch;

public class PeakEl {

    // first approach
    static  int peak1(int[]a){
        int str=0;int end=a.length-1;
        int ans=-1;
        while (str<=end){
            int mid=str+(end-str)/2;
            if(a[mid]<a[mid+1]){
                ans=mid+1;
                str=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return  ans;
    }

    static  int peak2(int []a){
        int n= a.length;
        int str=0;
        int end=a.length-1;
        while (str<=end){
            int mid=str+(end-str)/2;
            if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1])){
                return  mid;
            }
            else if (a[mid]<a[mid+1]) {
                str=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={0,1,0};
        int ans=peak1(arr);
        System.out.println(ans);

        int[]nums={1,2,1,3,5,6,4};
        int ans1=peak2(nums);
        System.out.println(ans1);

    }
}
