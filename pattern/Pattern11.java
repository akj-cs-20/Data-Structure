package pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                k++;
            } else {
                k--;
            }
            for (int j = 1; j <= n; j++) {
                if (j <= k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
