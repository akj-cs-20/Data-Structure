package pattern;

import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countNum,zeroNum = 0;
        for (int i = 1; i <= n; i++) {
            countNum = i;
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    if (j == 1 || j == i) {
                        System.out.print(countNum);
                    } else {
                        System.out.print(zeroNum);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
