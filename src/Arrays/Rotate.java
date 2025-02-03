package Arrays;

import java.util.ArrayList;

public class Rotate {
    static  int [] rotatebyk(int []arr_1,int k){
        int n =arr_1.length;
        k=k%n;
//       k=3
        int []ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr_1[i];
        }
        for(int s=0;s<n-k;s++){
            ans[j++]=arr_1[s];
        }
        return ans;
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
    static ArrayList<Long>reverse(ArrayList<Long>arr){
        int i=0; int j= arr.size()-1;
        int idx=0;
        while (i<j){

        }
        return arr;
    }


    static  void rotatebykIn(int[]arr_1,int k){
        int n=arr_1.length;
        k=k%n;
        reversefrmindex(arr_1,n-k,n);
        reversefrmindex(arr_1,0,n-k-1);
       reversewithoutspace(arr_1);
    }

    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static  void swapList(ArrayList<Long>arr,int i,int j){
        Long temp= arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j,temp);
    }

    static void reverseInGroup(ArrayList<Long>arr,int k){
        int size= arr.size();
        k=k%size;
        swapList(arr,size-k,size);
        swapList(arr,0,size-k-1);

    }

    public static void main(String[] args) {
        long []arr={1, 2, 3, 4, 5};
        int k=3;
        ArrayList<Long> li =new ArrayList<>();
        for(long x:arr){
            li.add(x);
        }
        reverseInGroup(li,k);

        System.out.println("list: "+li);
        System.out.println(li.size());

//      reverseInGroup(li,k);
//        System.out.println(k%6);
////        int []ans=rotatebyk(arr,k);
////        printArray(ans);


    }
}
