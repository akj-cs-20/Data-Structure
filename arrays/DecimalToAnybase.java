package arrays;

public class DecimalToAnybase {
    public static void main(String[] args) {
        int snum = 238;
        int db = 5;
        int dnum = decimalToAnybase(snum, db);
        System.out.println(dnum);
    }

    public static int decimalToAnybase(int snum , int db) {
        int dnum = 0;
        int multiply = 1;
        while (snum != 0) {
            int rem = snum % db;
            dnum += (rem * multiply);
            multiply *= 10;
            snum /= db;
        }
        return dnum;
    }
}
