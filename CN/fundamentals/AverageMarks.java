package CN.fundamentals;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstMarks = scanner.nextInt();
		int secondMarks = scanner.nextInt();
		int thirdMarks = scanner.nextInt();
		double averageMarks = (firstMarks + secondMarks + thirdMarks) / 3;
		System.out.println(averageMarks);
	}

}
