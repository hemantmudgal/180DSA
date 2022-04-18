package CN.pattern;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		int i = 0;
		while(i < inputValue) {
			int j = 0;
			while(j < inputValue) {
				int charToPrint = 'A' + j;
				System.out.print((char)charToPrint);
				j++;
			}
			i++;
			System.out.println();
			
		}
	}
}
