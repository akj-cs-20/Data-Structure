package pattern;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count = count * (i - j) / j;
            }
            System.out.println();
        }
    }
}
