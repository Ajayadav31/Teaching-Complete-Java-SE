package arrays01;

import java.util.Scanner;

public class Enhanced2DArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[][] brr = new int[2][3]; // 2 row * 3 colums = 6 elements

        for (int i = 0; i < brr.length; i++) {
            // upper loop -> rows
            System.out.println("Enter 3 value for brr[" + i + "]" + " : ");
            for (int j = 0; j < brr[0].length; j++) {
                // lower loop -> colums
                brr[i][j] = kb.nextInt();
            }
        }

        System.out.println("Elemts of 2 D arrys is: ");

        for (int arr[] : brr) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }

        // for (int arr[][] : crr) {
        // for (int brr[] : arr) {
        // for (int val : brr) {
        // System.out.println(val);
        // }
        // }
        // }

        // for (int i = 0; i < brr.length; i++) {
        // // upper loop -> rows
        // for (int j = 0; j < brr[0].length; j++) {
        // // lower loop -> colums
        // System.out.print(brr[i][j] + " ");
        // }
        // }

    }
}
