package CN.pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 1;
		while(i <= n) {
			int p = i;
			int j = 1;
			while(j <= i) {
				System.out.print(p--);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
