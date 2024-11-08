package Arrays;

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

    public static void main(String[] args) {
        int[] ar = {0,-2,0,-3,-4};
        int ans=second(ar);
        System.out.println(ans);
    }
}

