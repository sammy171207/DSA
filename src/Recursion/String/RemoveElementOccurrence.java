package Recursion.String;

public class RemoveElementOccurrence {

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
    }
}
