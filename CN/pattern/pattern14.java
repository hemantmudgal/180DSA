package CN.pattern;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		scanner.close();
		int i = 1;
		while(i <= inputValue) {
			int j = 1;
			while(j <= inputValue - i + 1) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
			
		}

	}
}
