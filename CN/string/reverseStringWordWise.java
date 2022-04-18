package CN.string;

import java.util.Scanner;

public class reverseStringWordWise {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = reverseStringWordWise(str);
		System.out.println(ans);
	}

	private static String reverseStringWordWise(String str) {
		int i;
		String ans = "";
		for(i=str.length()-1;i>=0;i--) {
			ans = ans + str.charAt(i);
		}
		String reverseString = "";
		int currentWordStart = 0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				int currentWordEnd = i - 1;
				
				for(int j=currentWordStart;j<=currentWordEnd;j++) {
					reverseString = str.charAt(j) + reverseString;
				}
				
				ans += reverseString + " ";
				currentWordStart = i + 1;
			}
		}
		
		ans += reverseString;
		return ans;
		}

}
