package CN.pattern;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int i = 1;
		while(i <= input) {
			int j =1;
			while(j <= input) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
