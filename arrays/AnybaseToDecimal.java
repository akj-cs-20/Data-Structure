package arrays;

public class AnybaseToDecimal {
    public static void main(String[] args) {
        int snum = 1423;
        int sb = 5;
        int dnum = anybaseToDecimal(snum, sb);
        System.out.println(dnum);
    }
    
    public static int anybaseToDecimal(int snum , int sb) {
        int dnum = 0;
        int multiply = 1;
        while (snum != 0) {
            int rem = snum % 10;
            dnum += (rem * multiply);
            multiply *= sb;
            snum /= 10;
        }
        return dnum;
    }
}
