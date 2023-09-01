package assignments;
import java.util.Scanner;

public class Example3Of2DArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[5][2];
		for(int i = 0; i < arr.length;i++) {
			System.out.print("Enter 2 element of arr[" + i + "] : ");
			for(int j = 0; j < arr[0].length ; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[0].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
