public class SearchIn2D {
    static  boolean searchTargert(int[][]arr,int target){
        int n=arr.length;//number of row  4
        int m=arr[0].length;//number of colums; 4
        int start=0; int end=n*m-1; //7
        while (start<=end){
            int mid=start+(end-start)/2;
            int midEl=arr[mid/m][mid/n];
            if(target==midEl){
                return  true;
            }
            if(target>midEl){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
      return false;
    }

    static boolean SeconddWay(int[][]arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int i=0,j=m-1;
        while (i<n&&j>=0){
            if(target==arr[i][j]) return true;
            else if (target<arr[i][j]) {
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target=10;
         boolean ans=SeconddWay(arr,target);
        System.out.println(ans);
    }
}
