package CN.string;

import java.util.Scanner;

public class PrintAllSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printAllSubstring(str);
	}
	
	public static void printAllSubstring(String str) {
		int n = str.length();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				String string = str.substring(i,j+1);
				System.out.print(string + " ");
			}
		}
	}

}
