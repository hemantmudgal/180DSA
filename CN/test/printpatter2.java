package CN.test;

import java.util.Scanner;

public class printpatter2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		int i = 1;
		while(i <= userInput) {
			int j =1;
			while(j <= userInput - i + 1) {
				System.out.print(j++);
			}
			
			j = 2;
			while( j < 2*i) {
				System.out.print("*");
				j++;
			}
			
			j = 1;
			int p = userInput - i + 1;
			while(j <= userInput  - i + 1) {
				System.out.print(p--);
				j++;
			}			
			
			
			i++;
			System.out.println();
		}
	}

}
