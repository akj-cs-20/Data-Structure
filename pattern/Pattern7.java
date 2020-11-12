package pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= k+i && j <= ((n - 1) + i)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }
            k++;
            System.out.println();
        }
    }
}
