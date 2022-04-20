package CN.searchingandsorting.assignment;

import java.util.Arrays;

public class SecondLargestElementInArray {
	
//	public static int secondLargestElement(int[] array) {
//		int secondLargestElement = -1;
//		int firstLargestEelement = -1;
//		
//		for(int i=0;i<array.length;i++) {
//			if(array[i] > firstLargestEelement) {
//				firstLargestEelement = array[i];
//			}
//		}
//		
//		for(int i=0;i<array.length;i++) {
//			if(array[i] != firstLargestEelement && array[i] > secondLargestElement) {
//				secondLargestElement = array[i];
//			}
//		}
//		return secondLargestElement;
//	}

	public static int findSecondLargestElement(int[] array) {
		int value = Integer.MIN_VALUE;
		Arrays.sort(array);
		for(int i=array.length-1;i>0;i--) {
			if(array[i] != array[i-1]) {
				value = array[i-1];
				return value;
			}
		}
		return value;
	}
	
	public static void main(String[] args) {
		int[] array = {2,13,4,13,6,28};
		int value = findSecondLargestElement(array);
		System.out.println(value);
//		value = secondLargestElement(array);
//		System.out.println(value);
	}
}
