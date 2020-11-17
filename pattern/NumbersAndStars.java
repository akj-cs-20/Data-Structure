package pattern;

import java.util.Scanner;

public class NumbersAndStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0,num=0,numdec = n ;
        for (int i = 1; i <= n; i++) {
            num = 1;
            
            if (i <= 2) {
                k = n;
                
            } else {
                k++;
            }
            for (int j = 1; j <= 2 * n - 2; j++) {
                if (j <= k) {
                    if (j <= numdec) {
                        System.out.print(num+" ");
                        num++;

                    } else {
                        System.out.print("*"+" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            numdec--;
            System.out.println();
        }
    }
}
