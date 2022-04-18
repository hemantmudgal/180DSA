package CN.pattern;

import java.util.Scanner;

public class patter18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int i = 0;
		int p = input;
		while(i < input) {
			int j = 0;
			while( j < input - i) {
				System.out.print(p);
				j++;
			}
			p--;
			i++;
			System.out.println();
		}
	}

}
