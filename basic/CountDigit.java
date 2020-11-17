package basic;

import java.util.Scanner;

public class CountDigit {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        int numberToCount = scanner.nextInt();
        System.out.println(countNumber(num, numberToCount));
    }
    
    public static int countNumber(int num, int numberToCount) {
        int countDigit = 0,rem;
        while (num != 0) {
            rem = num % 10;
            if (rem == numberToCount) {
                countDigit++;
            }
            num = num / 10;
        }
        return countDigit;
    }
}
