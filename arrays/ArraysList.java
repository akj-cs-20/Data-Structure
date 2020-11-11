package arrays;

import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println(arr);

        // add
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(3, 40);

        // get size
        System.out.println(arr.size());

        // whole arrays print
        System.out.println(arr);

        // get value
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));

        // check value contains or not
        System.out.println(arr.contains(30));

        // update
        arr.set(2, 2000);
        System.out.println(arr);

        // remove 
        arr.remove(2);
        System.out.println(arr);

        // isempty
        System.out.println(arr.isEmpty());

        
    }
}
