package String;

import java.util.HashMap;
import java.util.Map;

public class CountAndSay {
    static String getNext(String s){
        StringBuilder res=new StringBuilder();
        int cnt=1;
        char prev=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==prev){
                cnt++;
            }else{
                res.append(cnt).append(prev);
                cnt=1;
                prev=s.charAt(i);
            }
        }
        res.append(cnt).append(prev);
        return res.toString();
    }
    static String  countandsays(int idx,int n,String next){
        if(idx>n){
            return next;
        }
        countandsays(idx+1,n,getNext(next);

    }
    public static void main(String[] args) {
        int n=4;
        int idx=1;

        countandsays( idx, n,"1");
    }
}
