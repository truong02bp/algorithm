package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[')
                stack.push(c);
            if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty())
                    return false;
                char prefix = stack.pop();
                if (c == '}' && prefix != '{')
                    return false;
                if (c == ']' && prefix != '[')
                    return false;
                if (c == ')' && prefix != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isValid(s));
    }
}
