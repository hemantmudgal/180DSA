package CN.array;

import java.util.Arrays;

public class Sort01 {
	public static void main(String[] args) {
		int[] arr = {0,1,1,0,1,0,1};
		sort01(arr);
	}

	private static void sort01(int[] arr) {

		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}	
		System.out.println(Arrays.toString(arr));

	}

}
