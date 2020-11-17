package basic;

import java.util.Scanner;

public class IsArmStrong {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        System.out.println(isArmStrong(num));
    }
    public static boolean isArmStrong(int num) {
        
        int sum = 0, temp, div,numOfDigits,powers;
        String s = String.valueOf(num);
        numOfDigits = s.length();
        powers = numOfDigits;
        temp = num;
        
        while (num != 0) {
            div = num % 10;
            num = num / 10;
            sum = sum + (int)Math.pow(div, powers);

        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
        
    }
}
