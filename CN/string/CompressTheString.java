package CN.string;

import java.util.Scanner;

public class CompressTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String printString = encryptString(str);
		System.out.println(printString);
	}
	
	public static String encryptString(String str) {
		String result = "";
		int count = 1;
		
		if(str.length() == 0) {
			return result;
		}
		result += str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			}else{
				if(count > 1) {
				result += count;
				count = 1;
				}
				result += str.charAt(i);
			}
		}
		
		if(count > 1) {
			result += count;
		}
		
		return result;
	}
	
}
