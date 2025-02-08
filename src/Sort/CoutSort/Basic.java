package Sort.CoutSort;

import java.util.ArrayList;
import java.util.Collections;

public class Basic {

    static int max(int[] arr) {
        int maxNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxNo < arr[i]) {
                maxNo = arr[i];
            }
        }
        return maxNo;
    }

    static void basicCountSort(int[] arr) {
        int maxNo = max(arr);
        int[] count = new int[maxNo + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;  // count[12]++
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }


    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / place) % 10]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }


    static void radixSort(int[] arr) {
        int max = max(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    static void bucketSort(int[] arr) {
        int n = arr.length;
        if (n <= 0)
            return;

        // Create empty buckets
        ArrayList<Integer>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Find maximum value to determine the range of the bucket index
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        // Add elements into our buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (arr[i] * n) / (maxValue + 1);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        // Merge all buckets to get the final sorted array
        int idx = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[idx++] = buckets[i].get(j);
            }
        }
    }
    public static void main(String[] args) {
    int []arr={12, 45, 78, 23, 56, 89, 34, 67, 100, 29};
//    int ma=max(arr);
//        System.out.println(ma);
//    radixSort(arr);
        bucketSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
        }
    }

