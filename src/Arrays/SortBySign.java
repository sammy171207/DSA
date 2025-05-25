package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortBySign {
  static int[] reArrage(int[]arr){
      ArrayList<Integer>pos=new ArrayList<>();
      ArrayList<Integer>neg=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          if(arr[i]>0) pos.add(arr[i]);
          else neg.add(arr[i]);
      }
      if(pos.size()<neg.size()){
          for(int i=0;i<pos.size();i++){
              arr[2*i]=pos.get(i);
              arr[2*i+1]=neg.get(i);
          }

          int idx=pos.size()*2;
          System.out.println(idx);
          for(int i=pos.size()*2;i<neg.size();i++){
              arr[idx]=neg.get(i);
              idx++;
          }
      }
      else{
          for(int i=0;i<neg.size();i++){
              arr[2*i]=pos.get(i);
              arr[2*i+1]=neg.get(i);
          }
          int idx=neg.size()*2;
          for(int i=neg.size()*2;i<pos.size();i++){
              arr[idx]=pos.get(i);
              idx++;
          }
      }
      return  arr;
  }
    public static void main(String[] args) {
     int[] arr={3,1,-2,-5,2,-4,-7};
     int[]ans=reArrage(arr);
     for(int x :ans){
         System.out.printf(x+" ");
     }
    }
}
