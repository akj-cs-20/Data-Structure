package pattern;

import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = 0, num2 = 1,nextNum;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(num1);
                    nextNum = num1 + num2;
                    num1 = num2;
                    num2 = nextNum;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
