package arrays01;

import java.util.Scanner;

public class EnhacedForLoop {
    public static void main(String[] args) {
        // Enhanced for loop & For each loop bothe are same

        int[] arr;
        arr = new int[10];

        Scanner kb = new Scanner(System.in);

        // for input in the array
        System.out.println("Please inpute int values: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        // System.out.println("Values present in the array ");

        /*
         * // first way
         * for (int i = 0; i < arr.length; i = i + 2) {
         * System.out.print(arr[i] + "  ");
         * }
         * 
         * // second way
         * System.out.println();
         * 
         * for (int i = 0; i < arr.length; i++) {
         * if (i % 2 == 0) {
         * System.out.print(arr[i]);
         * }
         * 
         * }
         */

        // for output from the array
        System.out.println("Values present in the array ");

        for (int element : arr) {
            System.out.print(element + 10 + " ");
        }
    }
}
