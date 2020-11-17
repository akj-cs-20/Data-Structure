package basic;

import java.util.Scanner;

public class IncreasingAndDecreasingSequence {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p  = 10000000;
		while(n>0) {//this while loop will check the condtion for the decreasing function
			int s = sc.nextInt();
			if(s>=p) {  
				p=s;
                n--;
				break;
			}
			p=s;
			n--;
		}
		int flag=0;
		while(n>0) {//this while loop will check the increasing numbers
			int s = sc.nextInt();
			if(s<=p) {   
				flag=1;   
				break;
			}
			p=s;
            n--;   
		} 
		if(flag==0&&n==0)   //Changed this to check whether whole list is traversed or not
		    System.out.println("true");
		else{
			System.out.println("false");
		}
    }
}
