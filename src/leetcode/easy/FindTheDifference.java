package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i=0;i<t.length();i++) {
            map2.merge(t.charAt(i), 1, Integer::sum);
        }

        for (int i=0;i<t.length();i++) {
            Integer value = map2.get(t.charAt(i));
            Integer valueAccept = map.get(t.charAt(i));
            if (valueAccept == null || !valueAccept.equals(value))
                return t.charAt(i);
        }
        return 'a';
    }

    public static void main(String[] args) {

    }
}
