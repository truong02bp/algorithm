package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> cumulative = new HashMap<>();
        int counter=0;
        int liked=2;
        int shared = 5;
        for (int i=1;i <= n; i++) {
            liked = shared / 2;
            counter+=liked;
            cumulative.put(i, counter);
            shared = liked*3;
        }
        System.out.println(cumulative.get(n));
    }
}
