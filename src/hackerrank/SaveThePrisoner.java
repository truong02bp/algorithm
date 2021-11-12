package hackerrank;

import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            m = m%n;
            int result = s + m -1;
            if (result > n)
                result = result%n;
            if (result == 0)
                System.out.println(n);
            else
                System.out.println(result);
            t--;
        }
    }
}
