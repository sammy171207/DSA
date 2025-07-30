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

       static int findXo(int A,int B,int C,int K){
           int ans=Integer.MAX_VALUE;
           int left=1,right=K;
           while(left<right){
             int mid=Math.abs(left+(right-left)/2);
             int val= (int) (A*Math.pow(mid,mid)+B*mid+C);
             if(val>=K){
                 ans=Math.min(ans,mid);
                 right=mid-1;
             }else{
                 left=mid+1;
             }
           }
           return ans;
       }

       static int sqrootBinary(int n){
           int low=0,high=n;
           int ans=-1;
           while(low<=high){
               int mid=low+(high-low)/2;
               int sq=mid*mid;
               if(sq==n){
                   return mid;
               }
                if(sq<n){
                    ans=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
           }
           return  ans;
       }

//       static  int rootMByK(int m,int k){
//           int low=0,high=m;
//           int ans=-1;
//           while(low<=high){
//               int mid=low+(high-low)/2;
//               int root= (int) Math.pow(m,k);
//               if(root=)
//           }
//       }
    public static void main(String[] args) {
//   int A=3,B=2,C=4;
//   int K=500;
//   int find=findXo(A,B,C,K);
//        System.out.println(find);
        int n=28;
        int ans=sqrootBinary(n);
        System.out.println(ans);

    }
}
