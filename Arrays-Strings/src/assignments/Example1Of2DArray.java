package assignments;
import java.util.Scanner;

public class Example1Of2DArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter 3 element of arr[" + i + "]");
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j] = in.nextInt();
				}
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
