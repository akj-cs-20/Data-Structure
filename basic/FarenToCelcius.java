package basic;

import java.util.Scanner;

public class FarenToCelcius {
    public static void main(String[] args) {
    
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int fmin=sc.nextInt();
		int fmax=sc.nextInt();
		int fstep=sc.nextInt();
		int fcurr = fmin;
        
		while(fcurr <= fmax){
			int cel = (int)((5.0/9)*(fcurr-32));
			System.out.println(fcurr + "\t"+cel);
			fcurr += fstep;
		}
    }
}
