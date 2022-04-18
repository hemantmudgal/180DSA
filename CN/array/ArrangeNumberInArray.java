package CN.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		int left = 0;
		int right = n-1;
		int counter = 1;
		
		while(left <= right) {
			if(counter % 2 == 1) {
				array[left] = counter;
				counter++;
				left++;
			}else {
				array[right] = counter;
				counter++;
				right--;
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
