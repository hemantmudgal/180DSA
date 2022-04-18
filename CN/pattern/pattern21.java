package CN.pattern;

import java.util.Scanner;

public class pattern21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int i = 0;
		while( i <= input) {
			int j = 0;

			while(j < input-i) {
				System.out.print(" ");
				j++;
			}
			
			while(j < input) {
				System.out.print("*");
				j++;
			}
			
			j = 0;
			while(j < i - 1) {
				System.out.print("*");
				j++;
			}
			
			i++;
			System.out.println();
			
		}
	}
}
