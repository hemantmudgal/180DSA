package CN.array;

import java.util.Scanner;

public class basicOpertationOfArrayUsingMehtods {

	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			System.out.println("Enter value for " + i + " index");
			array[i] = scanner.nextInt();
		}
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] array = takeInput();
		printArray(array);
	}
}
