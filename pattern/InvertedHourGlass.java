package pattern;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0,num;
        
        for (int i = 1; i <= (2 * n)+1; i++) {
            if (i <=n+1) {
                k++;
            } else {
                k--;
            }
            num = n;
            for (int j = 1; j <= (2 * n)+1; j++) {
                if ((j <= k) || (j >= ((2 * n) + 2) - k)) {
                    
                    if(j <= n){
                        System.out.print(num+" ");
                        num--;
                    } else if (j == n + 1) {
                        System.out.print("0"+" ");

                    } else {
                        num++;
                        System.out.print(num+" ");    
                       
                    }
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
