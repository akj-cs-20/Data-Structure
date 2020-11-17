package basic;

import java.util.Scanner;

public class RevisitedQuadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int root1 = (int)((-b - (Math.sqrt((b * b )- (4 * a * c)))) / 2);
        int root2 = (int)((-b + (Math.sqrt((b * b) - (4 * a * c)))) / 2);
        int determinant =(int) b * b - 4 * a * c;
        // System.out.println(root1 + " " + root2);

        // real and distinct
        if (determinant > 0) {
            System.out.println("Real and Distinct");
            if (root1 > root2) {
                System.out.print(root2 +" "+root1);
            } else {
                System.out.print(root1 +" "+root2);
            }
        } else if (determinant == 0) {
            System.out.println("Real and Equal");
            if (root1 == root2) {
                System.out.print(root1 +" "+root2);
            }
        } else {
            System.out.println("Imaginary");

        }
        
    }
}
