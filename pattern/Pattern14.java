package pattern;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int div = n/2;
        for (int i = 1; i <= n; i++) {
            if (i <= div+1) {
                k++;
            } else {
                k--;
            }
            for (int j = 1; j <= n; j++) {
                if (j <= (div+1) - k || j >= (div+1) + k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
