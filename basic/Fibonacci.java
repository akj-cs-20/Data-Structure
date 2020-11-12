package basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibnonacci(n);
    }
    
    public static void fibnonacci(int n) {
        int ffib = 0, sfib = 1,nextFib;

        for (int i = 0; i <= n; i++) {
            System.out.println(ffib);
            nextFib = ffib + sfib;
            ffib = sfib;
            sfib = nextFib;
        }
    }
}
