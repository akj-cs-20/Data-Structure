package basic;

public class ManmohanLovesPattern {
    public static void main(String[] args) {
        int n = 5;
        // pattern 1
        // for (int i = 1; i <= n; i++) {
        //     if (i == 1 || i == 2) {
        //         for (int j = 1; j <= i; j++) {
        //             System.out.print("1");
        //         }
        //     } else {
        //         for (int j = 1; j <= i; j++) {
        //             if (j == 1 || j == i) {
        //                 System.out.print(i - 1);
        //             } else {
        //                 System.out.print("0");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }
        
        // pattern 2
        for (int i = 1; i <= n; i++) {
            // even print first and last 1 rest 0
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    if( j == 1 || j == i){
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            } else {    //odd print n times 1
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}
