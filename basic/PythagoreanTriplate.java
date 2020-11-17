package basic;

import java.util.Scanner;

public class PythagoreanTriplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        pythTriplet(n);
       
    }public static void pythTriplet(long n) {
        long p ,q, a,b,c;
		if ( n <= 2) {
           System.out.println("-1");
        }else if (n % 2 != 0) {
            p = (n+1)/2;
            q = (n-1) / 2;
            a = (p + q) * (p - q);
            b = 2 * p * q;
            c = p * p + q * q;
            if(c * c == a * a + b * b){
				System.out.println(b + " " + c);
			}else{
				System.out.println("-1");
			}
            
        }else  {
            p = n/2;
            q = 1;
            a = (p + q) * (p - q);
            b = 2 * p * q;
            c = p * p + q * q;
            if(c * c == a * a + b * b){
				System.out.println(b + " " + c);
			}else{
				System.out.println("-1");
			}
            
           
        }
        
    }
}
