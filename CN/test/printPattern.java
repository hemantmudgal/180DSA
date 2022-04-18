package CN.test;

import java.util.Scanner;

public class printPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int i = 1;
		
		while(i <= input) {
			int temp = input;
			int j = 1;
			while( j <= input) {
				if(temp == i) {
					System.out.print("*");
					break;
				}
					System.out.print(temp--);
					j++;	
			}
			 j = 2;
			 int p = i;
			while(j < i + 1) {
				System.out.print(--p);
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
