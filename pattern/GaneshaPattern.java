package pattern;

import java.util.Scanner;

public class GaneshaPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // work
            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j == i  || j >= ((n+1)/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }else if(i > 1 && i < ((n+1)/2)){
                for (int j = 1; j <= n; j++) {
                    if (j == 1  || j == ((n+1)/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }else if( i == ((n+1)/2)){
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }else if(i > ((n+1)/2) && i < n){
                for (int j = 1; j <= n; j++) {
                    if (j == n  || j == ((n+1)/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == n  || j <= ((n+1)/2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            
            // prep
            System.out.println();
        }
    }
}
