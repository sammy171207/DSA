package BinarySearch;

public class RotatedSortedArray {
    static int search(int[] arr, int target) {
        int str = 0;
        int end = arr.length - 1;
        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    str = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[str] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    str = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 4;
        System.out.println(search(arr, target));
    }
}
