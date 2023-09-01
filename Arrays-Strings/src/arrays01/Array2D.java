package arrays01;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // 2D arrays
        int[][] arr = new int[3][6];
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        // i for upper for loop -> row
        for (int i = 0; i < arr.length; i++) {
            // j for inner for loop -> colume
            System.out.println("Enter values for: arr[" + i + "] " + "-> enter 5 elements");

           // for (int j = 0; j < arr[0].length - 1; j++) {
            	for (int j = 0; j < arr[0].length ; j++) {
                arr[i][j] = kb.nextInt();

            }
        }

        System.out.println("\nElements of an arrays");

        for (int i = 0; i < arr.length; i++) {
            // j for inner for loop -> colume
            //for (int j = 0; j < arr[0].length - 1 ; j++) {
            	for (int j = 0; j < arr[0].length ; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
