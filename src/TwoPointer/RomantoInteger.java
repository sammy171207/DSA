package TwoPointer;


import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    static int romantoInt(String str){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum=0;
        for(int i=0;i<str.length();i++){
            int current=map.get(str.charAt(i));
            int next = (i < str.length() - 1) ? map.get(str.charAt(i + 1)) : 0;

            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str="MCMXCIV";
        System.out.println(romantoInt(str));
    }
}
