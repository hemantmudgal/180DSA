package CN.string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = reversTring(str);
		System.out.println(reverse);
	}

	private static String reversTring(String str) {
		String anotherString = "";
//		for(int i=str.length()-1; i>=0;i--) {
//			char ch = str.charAt(i);
//			anotherString += ch;
//		}
		
		for(int i=0;i<str.length();i++) {
			char ch =  str.charAt(i);
			anotherString = ch + anotherString;
		}
		return anotherString;
	}
	
	
}
