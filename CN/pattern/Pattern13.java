package CN.pattern;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int i = 1;
		while( i <= input) {
			int j = 1;
			char ch = (char)('A' + input - i);
			while( j <= i) {
				System.out.print(ch++);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
