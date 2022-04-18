package CN.pattern;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		scanner.close();
		int i = 1;
		while(i <= inputValue) {
			int spaces = 1;
			while(spaces <= inputValue - i) {
				System.out.print(' ');
				spaces++;
			}
			
			int stars = 1;
			while(stars <= i) {
				System.out.print(stars);
				stars = stars + 1;
			}
			System.out.println();
			i++;
		}
	}
}
