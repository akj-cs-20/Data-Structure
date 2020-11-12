package basic;

import java.util.Scanner;

public class PrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean res = primeNonprime(n);
        System.out.println(res);
    }
    
    public static boolean primeNonprime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
