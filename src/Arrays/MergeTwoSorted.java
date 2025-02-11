package Arrays;

import java.util.Arrays;

public class MergeTwoSorted {
    static  void mergeSortArr(int [] num1,int m,int[] num2,int n){
        int size = m + n;
        int[] ans = new int[size];
        int n1 = 0, n2 = 0, i = 0;
        while (n1 < m && n2 < n) {
            if (num1[n1] < num2[n2]) {
                ans[i++] = num1[n1++];
            } else {
                ans[i++] = num2[n2++];
            }
        }
        while (n1 < m) {
            ans[i++] = num1[n1++];
        }
        while (n2 < n) {
            ans[i++] = num2[n2++];
        }
        for (int x : ans) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int []num1={1,2,3,0,0,0};
        int[]num2={2,5,6};
        int m=3;
        int n=3;

        mergeSortArr(num1,m,num2,n);
    }
}
