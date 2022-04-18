package CN.string;

import java.util.Scanner;

public class CheckStringPermutation {

	 public static boolean areAnagram(String str1, String str2){
	        // Write your code here.
		if(str1.length() != str2.length()) return false;
		
		int[] array = new int[256];
		
		int temp = 0;
		for(int i=0;i<str1.length();i++) {
			temp = (int)str1.charAt(i);
			array[temp]++;
		}
		
		int anotherTemp = 0;
		for(int i =0;i<str2.length();i++) {
			anotherTemp = (int) str2.charAt(i);
			array[anotherTemp]--;
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i] != 0)
				return false;
		}
		
		return true;
	 }
		
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(areAnagram(str1, str2)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
