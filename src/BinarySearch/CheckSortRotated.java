package BinarySearch;

public class CheckSortRotated {
    static int minNumber(int[]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
        }
        return min;
    }
    static boolean isSortedRotated(int[]arr){
        int min=minNumber(arr);
        int n=arr.length;
        int dropdown=0;
        for(int i=0;i<n;i++){
            int next=(i+1)/2;
            if(arr[i]>arr[next])dropdown++;
            if(dropdown==1 && !(arr[0]<arr[n-1] && arr[0]==min)){
                return true;
            }
        }
        return  false;
    }

    static int minElementInRotated(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
    public static void main(String[] args) {
        int[]arr={3,4,7,9,1,2};
        int[]arr1={4,6,7,9,10,-1,0,1,2,3};
        System.out.println(minElementInRotated(arr1));
//        System.out.println(isSortedRotated(arr));
    }
}
