package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // declaration
        int[] arr = null;

        // initialization
        arr = new int[5];

        System.out.println(arr); //this gives address of arr refrence var
        
        // get value through loop array loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " at : " + arr[i]);
        }
        
        // update value of arrays 
        arr[2] = 40;

        System.out.println("After update : ");
         // get value through loop array loop
         for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " at : " + arr[i]);
        }


    }
}
