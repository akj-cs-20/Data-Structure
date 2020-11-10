package arrays;

import java.util.Scanner;

public class ArrayOps {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        // int[] arrays  = takeInput();
        int[] arrays = { 1, 2, 2, 2, 2, 3, 3, 3, 9, 11 };
        displayElementsArray(arrays);

        int maxElement = maxArray(arrays);
        System.out.println("maximum element in arrays : " + maxElement);

        int minElement = minArray(arrays);
        System.out.println("minimum element in arrays : " + minElement);
        
        int sum = sumArrays(arrays);
        System.out.println("Sum of total arrays is : " + sum);

        boolean searchValue = linearSearch(3, arrays);
        System.out.println("value found = " + searchValue);
        
        int resultBinarySearch = binarySearch(31, arrays);
        System.out.println("Value found at index : " + resultBinarySearch);
        
        int upperBoud = upperBound(arrays, 3);
        int lowerBoud = lowerBound(arrays, 2);
        System.out.println("Lowerbound : "+lowerBoud+" upperbound : "+upperBoud);
    }
    
    // taking input from user and store into an arrays 
    public static int[] takeInput() {
        System.out.println("Enter size of arrays : ");
        int size = scn.nextInt();

        // declaring arrays 
        int[] arrays = new int[size];

        // taking input from user
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Enter elements at " + i);
            arrays[i] = scn.nextInt();
        }

        return arrays;
    }

    // display array elements 
    public static void displayElementsArray(int[] arr) {
        System.out.println("Elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // max arrays elements 
    public static int maxArray(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    // linear search 
    public static boolean linearSearch(int data_to_search, int[] arr) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (data_to_search == arr[i]) {
                isFound = true;
                return isFound;
            }
        }
        return isFound;
    }

    // sum of arrays 
    public static int sumArrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    // min value of an arrays
    public static int minArray(int[] arr) {
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min_value > arr[i]) {
                min_value = arr[i];
            }
        }
        return min_value;
    }

    // Binary search
    public static int binarySearch(int data_to_search, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == data_to_search) {
                return mid;
            } else if (arr[mid] < data_to_search) {
                low = mid + 1;
            } else {
                high = mid - 1;
                ;
            }
        }
        return -1;
    }
    
    // upper bound (Binary Search)
    public static int lowerBound(int[] arr, int data) {
        int ans = -1, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data) {
                ans = mid;
                high = mid - 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    // upper bound (Binary Search)
    public static int upperBound(int[] arr, int data) {
        int ans = -1, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == data) {
                ans = mid;
                low = mid + 1;
            } else if ( data < arr[mid] ) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
