package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class MostwithKDistinct {
    public static int maxSubArrlen(String str, int k) {
        int right = 0, left = 0, maxlen = 0;
        HashMap<Character, Integer> mapCont = new HashMap<>();

        while (right < str.length()) {
            char ch = str.charAt(right);
            mapCont.put(ch, mapCont.getOrDefault(ch, 0) + 1);

            while (mapCont.size() > k) {
                char removeletter = str.charAt(left);
                mapCont.put(removeletter, mapCont.get(removeletter) - 1);
                if (mapCont.get(removeletter) == 0) {
                    mapCont.remove(removeletter);
                }
                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String str="aaabbccd";
        int k=2;
        int size=maxSubArrlen(str,k);
        System.out.println(size);
    }
}
