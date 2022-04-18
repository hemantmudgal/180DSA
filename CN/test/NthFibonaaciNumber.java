package CN.test;

import java.util.Scanner;

public class NthFibonaaciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		for(int i = 0; i < userInput; i++) {
			int f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println(f1);
	}

}
