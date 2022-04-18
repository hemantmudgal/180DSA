package CN.pattern;

import java.util.Scanner;

public class patter17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int i = 0;
		while(i < input) {
			int j = 0;
			while( j < input - i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
