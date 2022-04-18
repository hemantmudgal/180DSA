package CN.fundamentals;

import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start value");
		int startValue = scanner.nextInt();
		System.out.println("Enter end Value");
		int endValue = scanner.nextInt();
		System.out.println("Gap between each value");
		int steps = scanner.nextInt();
		
		while(startValue <= endValue) {
			double startCelsiusValue = (5.0/9.0) *(startValue - 32);
			double endCelsiusValue = (5.0/9.0) *(endValue - 32);
			System.out.println(startValue + "\t" + (int)startCelsiusValue);
			startValue = startValue + steps;
		}
	}

}
