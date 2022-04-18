package CN.test;

import java.util.Scanner;

public class ApOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfElement = sc.nextInt();
		boolean isAP = true;
		int[] array = new int[noOfElement];
		
		for(int i = 0; i < array.length - 1; i++) {
			array[i] = sc.nextInt();
		}
		
		int d = array[1] - array[0];
		for(int i = 1; i < array.length; i++ ) {
			if(array[i] - array[i - 1] != d) {
				isAP = false;
			}else {
				isAP = true;
			}
		}
		
		if(isAP) {
			System.out.println(isAP);
		}
	}
}
