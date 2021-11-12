package hackerrank;

import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int temp;
            int count = 0;
            for (int i=0;i<n;i++){
                temp = scanner.nextInt();
                if (temp <= 0)
                    count++;
            }
            if (count >= k)
                System.out.println("NO");
            else
                System.out.println("YES");
            t--;
        }
    }
}
