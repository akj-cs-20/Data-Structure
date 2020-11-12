package basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = revNumber(n);
        System.out.println(res);
    }

    public static int revNumber(int num) {
        int rev_num=0;
        while (num!= 0) {
            int rem = num % 10;
            rev_num = rev_num * 10 + rem;
            num = num / 10;
        }
        return rev_num;
    }
}
