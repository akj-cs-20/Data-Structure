package pattern;

import java.util.Scanner;

public class NumberAndStar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num,nump;
        for (int i = 1; i <= n; i++) {
            num = i;
            nump = 1;
            for (int j = 1; j <= n; j++) {
                
                if (j <= n) {
                    if (j <= num) {
                        System.out.print(nump);
                        nump++;
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
