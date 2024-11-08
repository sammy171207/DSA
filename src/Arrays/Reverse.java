package Arrays;

public class Reverse {
    static int [] reverse(int []arr_1){
        int []ans=new int[arr_1.length];
        int i=0;
        for(int j=arr_1.length-1;j>=0;j--){
            ans[i]=arr_1[j];
            i++;
        }
        return ans;
    }

    static  int []reversewithoutspace(int []arr_1){
        int i=0;int j=arr_1.length-1;
        int index=0;
        while (i<j){
              index= arr_1[i];
              arr_1[i]=arr_1[j];
              arr_1[j]=index;
              i++;
              j--;
        }
        return arr_1;
    }

    static  void reversefrmindex(int []arr_1,int i,int j){
        while (i<j){
             int temp=arr_1[i];
             arr_1[i]=arr_1[j];
             arr_1[j]=temp;
             i++;
             j--;
        }
    }

    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        reversefrmindex(arr,2,5);
        printArray(arr);

    }
}
