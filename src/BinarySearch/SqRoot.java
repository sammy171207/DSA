package BinarySearch;

public class SqRoot {
       static  void maximalSq(char[][] matrix){
           for(int i=0;i<matrix.length;i++){
               for(int j=0;j<matrix[i].length;j++){
                   System.out.print(j+" ");
               }
               System.out.println();
           }
       }

       static  int sqrt(int x){
         int str=0; int end=x;
         // if the perfect sqroot is not found so then assign mid which is the lowest  near sqroot of the number;
         int ans=-1;
         while (str<=end){
             int mid=str+(end-str)/2;
             int val=mid*mid;
             if(val==mid){
                 return mid;
             }
             else if(val< x){
                 ans=mid;
                 str=mid+1;
             }
             else{
                 end=mid-1;
             }
         }
         return ans;
       }
    public static void main(String[] args) {
//      char[][] matrix = {
//                {'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}
//        };
//
//    maximalSq(matrix);
        System.out.println(sqrt(4));

    }
}
