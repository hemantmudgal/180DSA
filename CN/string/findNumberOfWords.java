package CN.string;

import java.util.Scanner;

public class findNumberOfWords {
	public static void main(String[] args) {
		String str = "";
		int totalWord = findTotalWord(str);
		System.out.println(totalWord);
	}
	
	public static int findTotalWord(String str) {
		int spaces = 0;
		if(str.length() == 0) {
			return 0;
		}
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				spaces++;
			}
		}
		return spaces + 1;
	}
}
