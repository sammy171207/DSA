package Arrays;

public class CanSortArray {
      static boolean cansortbycheckbyte(int []nums){
          short pmax=0,cmin=0,cmax=0;
          byte pcnt=0;
          for(int x:nums){
              byte ccnt=(byte)Integer.bitCount(x);
              if(pcnt==ccnt){
                  cmin=cmin>x?(short)x:cmin;
                  cmax=cmax<x?(short) x:cmax;
              } else if (cmin<pmax) {
                  return false;
              }
              else{
                  pmax=cmax;
                  cmin=cmax=(short) x;
                  pcnt=ccnt;
              }
          }
          return cmin>=pmax;
      }
    public static void main(String[] args) {
      int [] check={3,16,8,4,2};
      boolean ans=cansortbycheckbyte(check);
        System.out.println(ans);
    }
}
