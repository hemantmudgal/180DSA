package CN.test;

import java.util.Scanner;

public class checkFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		boolean fibonaaciNumber = fibonaaciNumberOrNot(userInput);
		System.out.println(fibonaaciNumber);
	}

	public static boolean fibonaaciNumberOrNot(int input) {
		boolean fibonaaciNum = true;
		int firstNumber = 0;
		int secondNumber = 1;
		while(firstNumber < input) {
			int sumOfNumbers = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sumOfNumbers;
			sumOfNumbers = firstNumber + secondNumber;
		}
		if(input == firstNumber) {
			return fibonaaciNum;
		}else {
			return false;
		}	
	}
}
