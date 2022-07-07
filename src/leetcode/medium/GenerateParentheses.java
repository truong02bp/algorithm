package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    private static char[] chars = new char[]{'(', ')'};

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result, n, "");
        return result;
    }

    public static void backTrack(List<String> result, int n, String current) {
        if (2 * n == current.length()) {
            if (check(current)) {
                result.add(current);
            }
            return;
        }
        System.out.println(current.length());

        for (char aChar : chars) {
            current = current + aChar;
            backTrack(result, n, current);
            current = current.substring(0, current.length() - 1);
        }
    }


    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push('C');
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
