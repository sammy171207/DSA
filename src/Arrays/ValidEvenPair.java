package Arrays;

public class ValidEvenPair {
     static  int evenPair(int[]arr){
         int evenCount=0;
         int oddCount=0;
         for(int num:arr){
             if(num%2==0){
                 evenCount++;
             }
             else{
                 oddCount++;
             }
         }

         int cnt= (evenCount*(evenCount+1))/2;
         return cnt;
        }

        static void  pair(int[]arr){
         int cnt=0;
         for(int i=0;i<arr.length-1;i++){
             int sum=0;
             for(int j=1;j<arr.length;j++){
              sum= arr[i]+arr[j];

              if(sum%2==0){
                  cnt++;
              }
             }
         }
            System.out.println(cnt/2);
        }

    public static void main(String[] args) {
        int[]arr={5, 7, 9, 2, 4};
        pair(arr);
    }
}
