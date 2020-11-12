package arrays;

import java.util.Scanner;

public class PrimeVisit {
    // public static void main(String[] args) {
    //     int n = 10;
    //     sieveOfEratosThenes(n);
    // }

    //     public static void sieveOfEratosThenes(int n) {
    //         boolean[] prime = new boolean[n + 1];
    //         for (int i = 0; i < n; i++) {
    //             prime[i] = true;
    //         }

    //         for (int p = 2; p * p <= n; p++) {
    //             if (prime[p] == true) {
    //                 // update all multiples of p
    //                 for (int i = p * p; i <= n; i += p) {
    //                     prime[i] = false;
    //                 }
    //             }
    //         }

    //         // print all primes
    //         for (int i = 2; i <= n; i++) {
    //             if (prime[i] == true) {
    //                 System.out.println(i);
    //             }
    //         }
    //     }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 1;
		while(k <= num){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a <= 1){
				a = 2;
			}
			
			sieveOfEratosThenes(b,a);
			k++;
		}
    }
	public static void sieveOfEratosThenes(int n,int a) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }


        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                // update all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        
       
		int count = 0;
        for (int i = a; i <= n; i++) {
            if (prime[i] == true) {
                count++;
            }
        }
		System.out.println(count);
    }


}
