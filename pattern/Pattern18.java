package pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k++;
            
            for (int j = 1; j <= 2*n -1; j++) {
                if (j >= ((n+1) -i) && j <= ((n-1)+i))  {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
