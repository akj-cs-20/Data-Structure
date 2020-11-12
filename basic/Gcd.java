package basic;

public class Gcd {
    public static void main(String[] args) {
        int res = gcd(36, 60);
        System.out.println(res);
    }
    public static int gcd(int divident,int divisor) {
        
        while (divident % divisor != 0) {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;
        }
        return divisor;
    }
}
