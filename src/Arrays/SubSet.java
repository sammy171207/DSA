package Arrays;

import java.util.HashSet;

public class SubSet {
    static boolean bsubseta(int[]a,int[]b){
        int j=0;
        int cnt=0;
        while(j<b.length){
            int i=0;
            while (i<a.length){
                 if(b[j]==a[i]){
                     ++cnt;
                     break;

                 }
               i++;
            }
            j++;
        }
        if(cnt==b.length){
            return true;
        }else {
            return false;
        }
       }

       static boolean optimal(int []a,int[]b){
           HashSet<Integer> set = new HashSet<>();
           for (int num : a) {
               set.add(num);
           }

           for (int num : b) {
               if (!set.contains(num)) {
                   return false;
               }
           }

           return true;
       }



    public static void main(String[] args) {
     int []a={11, 7, 1, 13, 21, 3, 7, 3};
     int []b={11, 3, 7, 1, 7};

      boolean ans=bsubseta(a,b);
      System.out.println(ans);
    }

}
