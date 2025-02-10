package Arrays;

import java.util.ArrayList;

public class MissingRepeartingEl {

    static  int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static ArrayList<Integer>repeatmissing(int []arr){
        ArrayList<Integer>  ans=new ArrayList<>();
        int size=max(arr)+1;
        int []freqarr=new int[size];
        for(int i=0;i<arr.length;i++){
             freqarr[arr[i]]++;
        }
        for(int i=1;i<=freqarr.length-1;i++){
            if(freqarr[i]==0 || freqarr[i]==2){
                ans.add(i);
            }
        }
        return ans;
    }

    static ArrayList<Integer> optapproach(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
                ans.add(i + 1);
                break;
            }
        }

        return ans;
    }

    static ArrayList<Integer>optimalAooroach(int[]arr){
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        long sumN=(long) n*(n+1)/2;
        long sumSqN=(long) n*(n+1)*(2*n+1)/6;

        long sum=0,sumsq=0;
        for(int num:arr){
            sum+=num;
            sumsq+=(long) num*num;
        }
        long diff=sum-sumN;
        long sqDiff=sumsq-sumSqN;

        long sumXY=sqDiff/diff;

        int x=(int) ((sumXY+diff)/2);
        int y=(int) (sumXY-x);
        ans.add(x);
        ans.add(y);
        return ans;
    }
    public static void main(String[] args) {
        int []arr= {4, 3, 6, 2, 1, 1};
        ArrayList<Integer>out=optimalAooroach(arr);
        for(int x:out){
            System.out.print(x +" ");
        }
    }
}
