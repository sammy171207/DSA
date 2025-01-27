import java.util.*;

public class tset {
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] l = new int[n1];
        int[] r = new int[n2];

        // Correctly copy elements to temporary arrays
        for (int i = 0; i < n1; i++) {
            l[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            r[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of l[], if any
        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        // Copy remaining elements of r[], if any
        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }

    static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // Correct calculation of mid

            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right); // Correctly pass left, mid, right
        }
    }

    static void possiblesub(int[]arr){

    }
    static void CountTriangle(int[] arr) {
        // This method seems to be unused in your current code
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
//        sort(arr, 0, arr.length - 1);
      Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
        for(int i=0;i<=arr.length-3;i++){
             for(int j=0;j<3;j++){
                 System.out.print(arr[i+j]+" ");
             }
            System.out.println();
        }

    }
}
