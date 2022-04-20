package CN.searchingAndSorting.assignment;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] array1 = {3, 6, 9, 0, 0};
		int[] array2 = {4,10};
		int[] array3 = new int[array1.length + array2.length];
		array3 = mergerTwoSortedArrat(array1, array2);
		System.out.println(Arrays.toString(array3));
	}
	
	public static int[] mergerTwoSortedArrat(int[] array1, int[] array2) {
		int i = 0,j = 0,k=0;
		int[] array3 = new int[array1.length + array2.length];
		
		while(i < array1.length && j < array2.length) {
			if(array1[i] < array2[j]) {
				array3[k] = array1[i];
				i++;
				k++;
			}else {
				array3[k] = array2[j];
				j++;
				k++;
			}
		}
		
		while(i < array1.length) {
			array3[k] = array1[i];
			i++;
			k++;
		}
		
		while(j < array2.length) {
			array3[k] = array2[j];
			j++;
			k++;
		}
		
		return array3;
	}
	
	
}
