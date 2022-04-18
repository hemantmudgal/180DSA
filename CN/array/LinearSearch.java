package CN.array;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] array, int searchedValue) {
		for(int i=0;i<array.length;i++) {
			if(searchedValue == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valueForSearch = sc.nextInt();
		int[] array = {3,3265,1,5,6,8,96};
		int indexOfValue = linearSearch(array, valueForSearch);
		System.out.println(indexOfValue);
	}

}
