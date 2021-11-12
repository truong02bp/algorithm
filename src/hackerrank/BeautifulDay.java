package hackerrank;

import java.util.Scanner;

public class BeautifulDay {

    private static int toReserve(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int counter = 0;
        for (int i=a; i<=b; i++) {
            if (Math.abs(i - toReserve(i))%k==0)
                counter++;
        }
        System.out.println(counter);
    }
}
