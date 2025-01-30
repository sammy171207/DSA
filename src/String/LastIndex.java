package String;
//Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.
//Note: If '1' is not present, return "-1"
public class LastIndex {
      static int lastIdx(String s ){
          int last=-1;
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='1'){
                  last=i;
              }
          }
          return last;
      }

    public static void main(String[] args) {
         String s = "0";
        int a= lastIdx(s);
        System.out.println(a);
    }
}
