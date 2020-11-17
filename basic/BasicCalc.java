package basic;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.nextLine().charAt(0);
        if (ch == 'x' || ch == 'X') {
            return;
        } else {
            while (ch != 'x' || ch == 'X') {

                if (ch == '*') {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println(num1 * num2);
                } else if (ch == '/') {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println(num1 / num2);
                } else if (ch == '+') {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println(num1 + num2);
                } else if (ch == '-') {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println(num1 - num2);
                } else if (ch == '%') {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println(num1 % num2);
                } else {
                    System.out.println("Invalid operation. Try again.");
                }
                ch = scanner.next().charAt(0);
                if (ch == 'x' || ch == 'X') {
                    return;
                }
            }
        }
    }
}
