package pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            
            if (i <= 3) {
                k++;
            } else {
                k--;
            }
            for (int j = 1; j <= n; j++) {
                if (j==k || j ==(n+1) -k) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
                
            }
            
            System.out.println();
        }
    }
}
