package basic;

import java.util.Scanner;

public class DelhiOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLoop = scanner.nextInt();
       
        
        int i = 1;
        while (i <= numLoop) {
            int carNum = scanner.nextInt();
            int evenSum = 0, oddSum = 0;
            while (carNum != 0) {
                int rem = carNum % 10;
                if (rem % 2 == 0) {
                    evenSum += rem;
                } else {
                    oddSum += rem;
                }
                carNum /= 10;
            }
            if (evenSum % 4 == 0 || oddSum % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            i++;   
        }
      
        
    }
    
}
