package BinarySearch;

public class Basic {
    static  boolean search (int[]arr,int target){
      int st=0,end=arr.length-1;
      while (st<=end){
          int mid=(st+end)/2;
          if(arr[mid]==target){
              return true;
          }
          else if(target<arr[mid]){
              end=mid-1;
          }
          else{
              st=mid+1;
          }
      }
      return false;
    }
    public static void main(String[] args) {
  int []a={1,3,4,5,6,7,8,9};
  boolean ans=search(a,11);
        System.out.println(ans);
    }
}
