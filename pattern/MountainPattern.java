package pattern;

import java.util.Scanner;

public class MountainPattern {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int j = 1; j <= 2 * n -1 ; j++) {
                if (j <= i || j >= 2 * n -i) {
                    if (j < n) {
                        System.out.print(count);
                        count++;
                    } else if (j == n) {
                        System.out.print(count); 
                        
                    } 
                    else {
                        count--;
                        System.out.print(count);
                        
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
