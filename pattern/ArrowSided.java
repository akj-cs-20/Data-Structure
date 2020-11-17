package pattern;

import java.util.Scanner;

public class ArrowSided {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0, l = -1, div = n / 2, num_one ;
       
        if(n % 2 == 0){
            return;
        }else{
            for (int i = 1; i <= n; i++) {
                if (i <= div+1) { 
                    k++;
                    l += 2;
                         
                } else {
                    k--;
                    l -= 2;
                }
                num_one = k;
                
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if ((j >= ((n + 1) - l) && j <= ((n + 1) - k)) || (j >= ((n - 1) + k) && j <= ((n - 1) + l))) {
                        
                        if (( j >= ((n+1)-l) && j<= ((n+1)-k))) {
                            System.out.print(num_one+" ");
                            num_one--;
                        } else {
                            num_one++;
                            System.out.print(num_one+" ");
                            
                        }    
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
