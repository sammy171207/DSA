package Arrays;

public class SortTheSortedArr {
   static  void swapsort(int[]arr){
       int x=-1;
       int y=-1;
       if(arr.length==1){
           return ;
       }
       for(int i=1;i<arr.length;i++){
           if(arr[i-1]>arr[i]){
               if(x==-1){ //first confict
                    x=i-1;
                    y=i;
               }
               else{
                   y=i;
               }
           }
       }

       int temp=arr[x];
       arr[x]=arr[y];
       arr[y]=temp;
   }
    public static void main(String[] args) {
        int[]arr={3,8,6,7,5,9,10};
        swapsort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
