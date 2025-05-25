package Stack;

import java.util.Stack;

public class PostToInfix {
    static String postfixToInfix(String str) {
        Stack<String> stack = new Stack<>();
        int i = 0, n = str.length();

        while (i < n) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(Character.toString(ch));
            } else {
                if (stack.size() < 2) {
                    return "Invalid Postfix Expression";
                }
                String t2 = stack.pop();
                String t1 = stack.pop();
                String temp = "(" + t1 + ch + t2 + ")";
                stack.push(temp);
            }
            i++;
        }
        return stack.size() == 1 ? stack.pop() : "Invalid Postfix Expression";
    }
    public static void main(String[] args) {
        String postfix = "AB+C*D-";
        System.out.println(postfixToInfix(postfix));
    }
}
