package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    public static Map<Character, char[]> map = new HashMap<>() {
        {
            put('2', new char[]{'a', 'b', 'c'});
            put('3', new char[]{'d', 'e', 'f'});
            put('4', new char[]{'g', 'h', 'i'});
            put('5', new char[]{'j', 'k', 'l'});
            put('6', new char[]{'m', 'n', 'o'});
            put('7', new char[]{'p', 'q', 'r', 's'});
            put('8', new char[]{'t', 'u', 'v'});
            put('9', new char[]{'w', 'x', 'y', 'z'});
        }
    };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() <= 0)
            return result;
        backTrack(result, digits, "");
        return result;
    }

    public static void backTrack(List<String> result, String digits, String current) {
        if (digits.length() == current.length()) {
            result.add(current);
            return;
        }
        char[] values = map.get(digits.charAt(current.length()));
        for (int i = 0; i < values.length; i++) {
            backTrack(result, digits, current + values[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}
