package String;

import java.util.HashSet;

public class RepeatedChar {
    static int Repeatidx(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    static char RepeatChar(String s){
        HashSet<Character>seen=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            if(seen.contains(currentChar)){
                return currentChar;
            }
            else{
                seen.add(currentChar);
            }
        }
        return '\0';
    }

    static char repeat(String s){
        int[] frequency = new int[256]; // Assuming ASCII characters
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i)] > 1) {
                return s.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String s="abccbaacz";
        System.out.println(repeat(s));
        }
    }

