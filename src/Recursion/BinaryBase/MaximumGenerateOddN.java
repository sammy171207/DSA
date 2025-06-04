package Recursion.BinaryBase;

public class MaximumGenerateOddN {
    static String maximumbinaryStringofOddNumber(String s){
        int onesCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') onesCount++;
        }
        int zerosCount = s.length() - onesCount;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < onesCount - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < zerosCount; i++) {
            result.append('0');
        }
        result.append('1'); // Final 1 to make the number odd

        return result.toString();
    }
    public static void main(String[] args) {
        String s="0101";
        System.out.println(maximumbinaryStringofOddNumber(s));

    }
}
