package pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 0;
        for (int i = 1; i <= n; i++) {
            l = 1;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= ((n+1) -i) && j <= ((n-1)+i))  {
                    System.out.print(l);
                    if (j <= (n-1)) {
                        l++;
                    } else {
                        l--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
