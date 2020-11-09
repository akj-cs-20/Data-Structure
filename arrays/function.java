package arrays;

/**
 * function
 */
public class function {

    public static void main(String[] args) {
        int add = addition(10, 20);
        int sub = subtract(20, 10);
        int result = add + sub;
        if (result > 0) {
            System.out.println("positive : "+result);
        } else {
            System.out.println("negative : "+result);
        }
       
    }
    
    public static int addition(int a, int b) {
        return a + b;
    }
    
    public static int  subtract(int a, int b) {
        return a - b;
    }
}