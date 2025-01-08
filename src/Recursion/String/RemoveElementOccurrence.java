package Recursion.String;

public class RemoveElementOccurrence {


    static String removeOcc3(String str,char ch){

        if(str.length()==0){
            return " ";
        }
        String smallans=removeOcc3(str.substring(1),ch);
        char currChar=str.charAt(0);
        if(currChar!=ch){
            return currChar+smallans;
        }else{
            return smallans;
        }
    }
    static String removeOcc(String str,int idx,char ch){

        if(idx>=str.length()){
            return " ";
        }
       String smallans=removeOcc(str,idx+1,ch);
        char currChar=str.charAt(idx);
        if(currChar!=ch){
            return currChar+smallans;
        }else{
            return smallans;
        }
    }
    public static void main(String[] args) {
   String s="sameer";
   char ch='e';
  String print= removeOcc(s,0,ch);
  System.out.println(print);
  String out=removeOcc3(s,ch);
        System.out.println(out);
    }
}
