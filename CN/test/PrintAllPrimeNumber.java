package CN.test;

import java.util.Scanner;

public class PrintAllPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		for(int i = 2; i < userInput; i++) {
			boolean isPrime = true;
			for(int j = 2; j<i; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i);
			}
		}
	}

}
