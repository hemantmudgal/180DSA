package CN.pattern;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		scanner.close();
		int i = 0;
		while(i < inputValue) {
			char charToPrint = (char)('A'+ i);
			int j = 0;
			while(j < inputValue) {
				System.out.print(charToPrint);
				charToPrint = (char)(charToPrint + 1);
				j++;
			}
			i++;
			System.out.println();
			
		}
	}

	}
