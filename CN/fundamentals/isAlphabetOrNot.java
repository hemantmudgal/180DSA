package CN.fundamentals;

import java.util.Scanner;

public class isAlphabetOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		int value = (int)ch;
		if(value >= 97 && value <= 123) {
			System.out.println("0");
		}else if(value >= 65 && value <= 91){
			System.out.println("1");
		}else {
			System.out.println(-1);
		}
	}

}
