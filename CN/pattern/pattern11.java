package CN.pattern;

import java.util.Scanner;

public class pattern11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		int i = 0;
		while(i < inputValue) {
			int j = 0;
			while(j <= i) {
				int charToPrint = 'A' + i;
				System.out.print((char)charToPrint);
				j++;
			}
			i++;
			System.out.println();
			
		}
	}
}
