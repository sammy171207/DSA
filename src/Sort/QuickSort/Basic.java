package Sort.QuickSort;

public class Basic {

    // Swap function to swap elements at indices i and j
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition function to place the pivot element at the correct position
    static int partition(int[] arr, int str, int end) {
        int pivot = arr[str]; // Choosing the pivot as the first element
        int count = 0;
        // Count how many elements are less than the pivot
        for (int i = str + 1; i <= end; i++) {
            if (arr[i] < pivot) { // This condition was corrected
                count++;
            }
        }
        int pivotIndex = str + count;
        swap(arr, str, pivotIndex); // Place pivot at the correct position
        int i = str, j = end;

        // Adjust the elements around the pivot
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    // QuickSort function to sort the array
    static void quickSort(int[] arr, int str, int end) {
        if (str >= end) {
            return;
        }
        int pivot = partition(arr, str, end); // Partition the array
        quickSort(arr, str, pivot - 1); // Recursively sort the left part
        quickSort(arr, pivot + 1, end); // Recursively sort the right part
    }

    // Main function to test the QuickSort
    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 5, 4};
        for (int x : arr) {
            System.out.print(x + " "); // Print the sorted array
        }
        System.out.println("-------------------");
        quickSort(arr, 0, arr.length - 1); // Sort the array
        for (int x : arr) {
            System.out.print(x + " "); // Print the sorted array
        }
    }
}
