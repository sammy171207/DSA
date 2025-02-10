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

    static  boolean reverseWay(int[]arr,int st,int ed,int target){
        if(st>ed) return false;
        int mid=(st+ed)/2;
        if(target==arr[mid]){
            return  true;
        }
        else if(target<arr[mid]){
           return reverseWay(arr,st,mid-1,target);
        }
        else{
           return reverseWay(arr,mid+1,ed,target);
        }
    }
    public static void main(String[] args) {
  int []arr={1,3,4,5,6,7,8,9};
  boolean ans=search(arr,8);
        System.out.println(ans);
        boolean reverseans=reverseWay(arr,0, arr.length-1, 8);
        System.out.println(reverseans);
    }
}
