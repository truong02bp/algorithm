package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void test(List<Integer> values) {
        values.add(0);
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        test(values);
        values.forEach(System.out::println);
    }
}
