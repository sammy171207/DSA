package String;

public class WordBreak {
    static  boolean workBreak(String s,String[]wordDict){
        for(int i=0;i<wordDict.length;i++){
            if(!(s.contains(wordDict[i]))){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="catsandog";
        String[]wordDict={"cats","dog","sand","and","cat"};
        System.out.println(workBreak(s,wordDict));
    }
}
