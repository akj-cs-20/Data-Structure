package arrays;

import java.util.Scanner;

public class TwoDArrays {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // int[][] arr = { { 10, 0, 0, 0, 0 }, { 0, 30, 0, 0, 0 }, { 0, 0, 20, 0, 0 } };
        // int[][] arr = takeInput();
        // display(arr);

        int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        // waveprint(arr);
        spiralPrint(arr, 4, 4);
    }
    
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] takeInput() {
        System.out.println("Enter rows : ");
        int rows = scanner.nextInt();

        int[][] arr = new int[rows][];
        for (int row = 0; row < rows; row++) {
            System.out.println("Enter column for rows : " + row);
            int cols = scanner.nextInt();
            arr[row] = new int[cols];

            for (int col = 0; col < cols; col++) {
                System.out.println("Enter value for row : " + row + " and col" + col);
                arr[row][col] = scanner.nextInt();
            }
        }
        return arr;
    }

    // waveprint pattern
    public static void waveprint(int[][] arr) {
        // row
        for (int i = 0; i < arr.length; i++) {
            // col
            // row is even  print as it is
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else { //row == odd print reverse

                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    // spiral print
    public static void spiralPrint(int[][] arr,int row_end,int col_end ) {
        int start_row = 0;
        int start_col = 0;
        int iterator;
        while (start_row < row_end  && start_col < col_end) {
            // print 1st row from remaining rows
            for (iterator = start_col; iterator < col_end; ++iterator) {
                System.out.print(arr[start_row][iterator] + " ");
            }
            start_row++;

            // print last column from beginning
            for (iterator = start_row; iterator < row_end; ++iterator) {
                System.out.print(arr[iterator][col_end - 1] + " ");
            }
            col_end--;

            // print last two rows from beginning
            if (start_row < row_end) {
                for (iterator = col_end - 1; iterator >= start_col; --iterator) {
                    System.out.print(arr[row_end - 1][iterator] + " ");
                }
                row_end--;
            }
           
            // print the first two column from the beginning
            if (start_col < col_end) {
                for (iterator = row_end - 1; iterator >= start_row; --iterator) {
                    System.out.print(arr[iterator][start_col] + " ");
                }
                start_col++;
            }
            

        }

    }
}
