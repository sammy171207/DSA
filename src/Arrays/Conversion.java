package Arrays;

public class Conversion {
    static  int cntcoversion(int[]arr){
        int cnt=0;
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
                 if(i<j){
                     cnt++;
                 }
             }
         }
     }return cnt;
    }
    public static void main(String[] args) {
        int []arr= {2, 4, 1, 3, 5};
        System.out.println(cntcoversion(arr));
    }
}
