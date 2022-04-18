package CN.string;

import java.util.Scanner;

public class PrintAllCharacter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		printAllChar(str);
	}

	private static void printAllChar(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
		
	}

}
