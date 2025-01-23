package Arrays;

import java.util.Arrays;

public class SecondLargestDigit {
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int second(int[] arr) {
        int max = max(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return max(arr);
    }

    static int secondapp(int []arr){
        Arrays.sort(arr);
        int n = arr.length - 1;
        int max = arr[n];
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < max) {
                return arr[i];
            }
        }
        return -1;
    }



    public static void main(String[] args) {
//        int[] ar = {10, 10, 10};
//        int ans=secondapp(ar);
//        System.out.println(ans);

    }
}

