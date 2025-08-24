package Top15.String;

import java.util.*;

public class SortCharacterByFreq {
    static void sortbyfreq(String s1){
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder str=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:entryList){
            str.append(entry.getKey().toString().repeat(entry.getValue()));
        }
        System.out.println(str.toString());
    }
    public static void main(String[] args) {
        String str="tree";
        sortbyfreq(str);

    }
}
