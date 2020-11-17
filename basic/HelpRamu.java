package basic;

import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int c3 = scanner.nextInt();
            int c4 = scanner.nextInt();
            int nr = scanner.nextInt();
            int nc = scanner.nextInt();
            int r[] = new int[nr];
            int c[] = new int[nc];
            for(int i=0;i<nr;i++)
                r[i] = scanner.nextInt();
            for(int i=0;i<nc;i++)
                c[i] = scanner.nextInt();

            int costr=0,costc=0;
            for(int i=0;i<nr;i++)
                costr += Math.min(r[i]*c1 , c2);
            costr = Math.min(costr, c3);
            
            for(int i=0;i<nc;i++)
                costc += Math.min(c[i]*c1 , c2); 
            costc = Math.min(costc, c3);
            
            System.out.println(Math.min(c4,(costc+costr)));
 
        
        }
    }
}
