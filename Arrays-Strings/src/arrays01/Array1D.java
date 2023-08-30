package arrays01;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // arrays init...
        String[] emp = new String[5];

        // for input
        System.out.println("Enter values for arrys emp: ");
        for (int i = 0; i < emp.length; i++) {
            emp[i] = kb.nextLine();
        }

        // for output
        System.out.println();
        for (int i = 0; i < emp.length; i++) {
            System.out.print(emp[i] + " ");
        }

    }
}
