package CN.string;

import java.util.Scanner;

public class CheckPalidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean isPalindrome = palindromeOrNot(str);
		System.out.println(isPalindrome);
	}
	
	public static boolean palindromeOrNot(String str) {
		int i=0, j=str.length()-1;
		boolean isPalindrome = true;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;
			}else {
				i++;
				j--;
			}
		}
		
		return isPalindrome;
	}
}
