package pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int l = 0;
        for (int i = 1; i <= 2 * n; i++) {
           if (i <= 5) {
               k++;
           } else {
               k--;
           }
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= k+l && j <= ((n - 1) + k)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }
            if (i < n) {
                
                l++;
                
            } else {
                
                l--;
            }
            System.out.println();
        }
    }
}
