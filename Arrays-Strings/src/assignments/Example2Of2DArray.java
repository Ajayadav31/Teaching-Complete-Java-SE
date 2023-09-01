package assignments;
import java.util.Scanner;

public class Example2Of2DArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[4][5];
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
//		System.out.println(arr[3].length);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Enter 5 element of arr[" + i + "] :");
			for(int j = 0 ; j < arr[0].length ; j++) {
				arr[i][j] = in.nextInt();			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
