package String;

public class RotatedString {
      static boolean rotate(String s, String goal){
          if(s.length()!=goal.length())
              return false;
          return (s+s).contains(goal);
      }
    public static void main(String[] args) {
      String s="abcde";
      String goal="cdeab";
        System.out.println(s+goal);
      boolean ans= rotate(s,goal);
        System.out.println("check that s can be goal after shifting the variable :"+ ans);
    }
}
