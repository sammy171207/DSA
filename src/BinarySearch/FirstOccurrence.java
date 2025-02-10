package BinarySearch;
import java.util.Arrays;

public class FirstOccurrence {
    static int findFirstOccurrence(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int firstOccurrence = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                firstOccurrence = mid;
                end = mid - 1;  // Keep searching left for first occurrence
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstOccurrence;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 2, 33, 7, 5, 9, 6, 4, 2, 1, 5, 6, 4, 7, 8, 9, 2, 4, 5, 1};
        Arrays.sort(arr); // Sorting the array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int x = 5;
        int index = findFirstOccurrence(arr, x);

        if (index != -1) {
            System.out.println("First occurrence of " + x + " is at index: " + index);
        } else {
            System.out.println(x + " not found in the array.");
        }
    }
}
