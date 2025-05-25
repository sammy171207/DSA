package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InFixtoPost {
    static String postFix(String str) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        map.put('^', 3);
        map.put('*', 2);
        map.put('/', 2);
        map.put('+', 1);
        map.put('-', 1);

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.pop(); // Pop the '('
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        (map.get(stack.peek()) > map.get(ch) ||
                                (map.get(stack.peek()).equals(map.get(ch)) && ch != '^'))) {
                    ans.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-c)";
        System.out.println(postFix(str)); // Expected output: "abcd^c-*+"
    }
}
