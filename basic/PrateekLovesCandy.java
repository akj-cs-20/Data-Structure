package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class PrateekLovesCandy {
    // initializing the max value  
    static int MAX_SIZE = 1000005; 
      
    static ArrayList<Integer> primes = 
       new ArrayList<Integer>(); 
      
    // Function to generate N prime numbers  
    // using Sieve of Eratosthenes 
    static void SieveOfEratosthenes()  
    {  
       
        boolean [] IsPrime = new boolean[MAX_SIZE];  
          
        for(int i = 0; i < MAX_SIZE; i++) 
            IsPrime[i] = true; 
          
        for (int p = 2; p * p < MAX_SIZE; p++)  
        {  
            
            if (IsPrime[p] == true)  
            {  
                
                for (int i = p * p; i < MAX_SIZE; i += p)  
                    IsPrime[i] = false;  
            }  
        }  
      
        // Store all prime numbers  
        for (int p = 2; p < MAX_SIZE; p++)  
        if (IsPrime[p] == true)  
                primes.add(p); 
    }  
      
   
    public static void main (String[] args)  
    {
         // Function call 
        SieveOfEratosthenes(); 
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(primes.get(n-1));
        }
        
 
    } 
}
