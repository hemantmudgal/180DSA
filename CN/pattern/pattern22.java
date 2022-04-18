package CN.pattern;

import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int upperPattern = (int)(input/2f + 1);
		int i = 1;
		while(i <= upperPattern) {
			
			int j = 1;
			while(j <= upperPattern - i) {
				System.out.print(" ");
				j++;
			}
			
			j = 1;
			while(j <= 2 * i - 1 ) {
				System.out.print("*");
				j++;
			}
		
		int newVariable = input - upperPattern;
		 i = 1;
			while(i < newVariable) {
				
				j = 1;
				while(j < upperPattern - i) {
					System.out.print(" ");
					j++;
				}
				
				j = 1;
				while( j < 2 * i - 1) {
					System.out.print("*");
					j++;
				}
				
				
				i++;
				System.out.println();
			}
		}
	}
}
