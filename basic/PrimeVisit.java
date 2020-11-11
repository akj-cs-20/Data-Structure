package basic;

import java.util.Scanner;

public class PrimeVisit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);     
        int n = scn.nextInt();
        
        int cnt = 1;
        while (cnt <= n) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int count = 0;
            while (a <= b) {
                if (isPrime(a)) {
                    count++;
                }
                a++;
            }
            System.out.println(count);
            cnt++;
        }
        
    }
    
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
