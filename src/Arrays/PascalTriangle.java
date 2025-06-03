package Arrays;

import java.util.ArrayList;

public class PascalTriangle {

    // this is help tp find the element present at col and row directly  in pascal triangle
    static int nCr(int c, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (c - i);
            res /= (i + 1);
        }
        return res;
    }
    // this function print the  number of row which tell
    static ArrayList<Integer> printRow(int r) {
        int ans = 1;
        ArrayList<Integer> rowpas = new ArrayList<>();
        rowpas.add(ans);

        for (int i = 1; i < r; i++) {
            ans *= (r - i);
            ans /= i;
            rowpas.add(ans);
        }

        return rowpas;
    }

    static ArrayList<ArrayList<Integer>> generateTriangle(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> temp = printRow(i); // Corrected function call
            triangle.add(temp);
        }
        return triangle;
    }
    public static void main(String[] args) {
        int n = 5; // Example number of rows
        ArrayList<ArrayList<Integer>> pascalTriangle = generateTriangle(n);

        for (ArrayList<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}
