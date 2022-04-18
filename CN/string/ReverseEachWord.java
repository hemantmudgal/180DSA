package CN.string;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String temp = reverseEachWord(str);
		System.out.println(temp);
	}
	
	public static String reverseEachWord(String str) {
		String result = "";	
		int i;
		int currentWordStart = 0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				int currentWordEnd = i - 1;
				String reverseString = "";
				for(int j=currentWordStart;j<=currentWordEnd;j++) {
					reverseString = str.charAt(j) + reverseString;
				}
				
				result += reverseString + " ";
				currentWordStart = i + 1;
			}
		}
//		
//		int currentWordEnd = i - 1;
//		String reverseString = "";
//		for(int j=currentWordStart;j<=currentWordEnd;j++) {
//			reverseString = str.charAt(j) + reverseString;
//		}
//		
//		result += reverseString;
		return result;
	}
		
}

