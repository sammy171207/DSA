package BinarySearch;

public class DistriChochalte {
    static int disChochalate(int []arr,int nofStd){
        if(arr.length<nofStd)return -1;
        int ans=0,str=0,end=(int)1e9;
        while (str<=end){
            int mid=str+(end-str)/2;
            if(IsDivisonPossible(arr,nofStd,mid)){
                ans=mid;
                end=mid-1;
            }else{
                str=mid+1;
            }
        }
        return ans;
    }

    private static boolean IsDivisonPossible(int[] arr, int nofStd, int maxChochalte) {
        int noofStudent=1;
        int chochlatePack=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>maxChochalte)return false;
             if(arr[i]+chochlatePack<=maxChochalte){
                 chochlatePack+=arr[i];
             }else{
                 noofStudent++;
                 chochlatePack=arr[i];
             }
         }
         return noofStudent<=nofStd;
    }

    public static void main(String[] args) {
        int[] chocolates = {12, 34, 67, 90};
        int numOfStudents = 2;
        int result=disChochalate(chocolates,numOfStudents);
        System.out.println(result);
    }
}
