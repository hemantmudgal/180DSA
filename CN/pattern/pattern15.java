package CN.pattern;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		scanner.close();
		int i = 1;
		while(i <= inputValue) {
			int spaces = 1;
			while( spaces <= inputValue - i) {
				System.out.print(' ');
				spaces = spaces + 1;
			}
			
			int star = 1;
			while(star <= i	) {
				System.out.print('*');
				star = star + 1;
			}

			i++;
			System.out.println();
		}

	}
}
