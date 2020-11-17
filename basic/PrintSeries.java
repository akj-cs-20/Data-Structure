package basic;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int i = 1;
        int j = 1;
        while (j <= num1) {
            
            if ((3 * i + 2) % num2 != 0) {
                System.out.println((3 * i + 2));
                j++;
            }
            i++;
        }
    }
}
