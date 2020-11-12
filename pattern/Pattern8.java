package pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    if (j>=2 && j <= n-1) {
                        System.out.print(" ");

                    } else {
                        System.out.print("*");

                    }
                }
                
            }
            
            System.out.println();
        }
    }
}
