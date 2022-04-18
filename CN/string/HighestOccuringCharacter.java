package CN.string;

import java.util.Scanner;

public class HighestOccuringCharacter {
	
	public static char checkOuccerence(String s) {
		char ch = ' ';
		int[] array = new int[256];
		int temp = 0;
		for(int i=0;i<s.length();i++) {
			temp = (int)(s.charAt(i));
			array[temp]++;
		}
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		
		ch = (char)(index);
		
		return ch;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = checkOuccerence(str);
		System.out.println(ch);
	}

}
