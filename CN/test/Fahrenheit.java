package CN.test;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start value");
		double currentValue = sc.nextDouble();
		System.out.println("Enter end value");
		int endValue = sc.nextInt();
		System.out.println("Entre gap between calculation");
		int gap = sc.nextInt();
		calculateFarhenheit(currentValue, endValue, gap);
	}
	
	public static void calculateFarhenheit(double currentValue, int endValue, int gap ) {
		double calculatedValue = 0;
		for(double i = currentValue; i <= endValue; i += gap) {
				calculatedValue = (5.0 / 9) * (currentValue - 32);
				System.out.println(currentValue + "\t" + (int)calculatedValue);
				currentValue = currentValue + gap;
		}
	}
}
