package CN.pattern;

import java.util.Scanner;

public class pattern23 {

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
			
			int p = i;
			while(j < input) {
				System.out.print(p);
				j++;
				p++;
			}
			
			j = 0;
			p = 2 * ( i -1);
			while(j < i - 1) {
				System.out.print(p--);
				j++;
			}
			
			i++;
			System.out.println();
			
		}
	}
}
