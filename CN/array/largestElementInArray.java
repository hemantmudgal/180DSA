package CN.array;

import java.util.Scanner;

public class largestElementInArray {

	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = takeInput();
		int largestValue = largestElement(array);
		System.out.println(largestValue);
	}

	public static int largestElement(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}

}
