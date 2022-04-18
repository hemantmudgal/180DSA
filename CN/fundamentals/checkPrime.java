package CN.fundamentals;

import java.util.Scanner;

public class checkPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int div = 2;
		while(div <= input/2) {
			if(input % div == 0) {
				System.out.println("Composite");
				return;
			}
			div+=1;
		}
		System.out.println("Prime");
	}
}
