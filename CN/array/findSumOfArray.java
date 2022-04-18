package CN.array;

import java.util.Scanner;

public class findSumOfArray {

	public static void takeInput() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n = sc.nextInt();
			int[] array  = new int[n];
			for(int j=0;j<array.length;j++) {
				array[j] = sc.nextInt();
			}
			printArraySum(array);
		}
	}
	
	public static void printArraySum(int[] array) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
			System.out.print(sum);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		takeInput();
	}
}
