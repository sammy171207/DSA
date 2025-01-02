package Recursion;

import java.util.Scanner;

public class SeriesSumOfNumber {
    static int seriessumal(int n){
        if(n==0) return 0;
        if(n%2==0){
            return seriessumal(n-1)-n;
        }
        return seriessumal(n-1)+n;
    }

    static int normalsers(int n ){
        if(n==0) return 0;
        return normalsers(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans= normalsers(n);
        System.out.println("Normal Sum of N Natural Number "+ans);

        int alternatesum=seriessumal(n);
        System.out.println("Alternate Sum of Natural Number "+alternatesum);


    }
}
