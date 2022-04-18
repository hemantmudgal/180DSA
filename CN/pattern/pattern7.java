package CN.pattern;

import java.util.Scanner;

public class pattern7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int i = 1;
		int p;
		while(i <= input) {
			int j =1;
			p = i;
			while(j <= i) {
				System.out.print(p++);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
