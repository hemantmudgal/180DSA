package CN.test;

import java.util.Scanner;

public class findProbability {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of ball you want to pick out ");
		int ballsTakenOut = sc.nextInt();
		System.out.println("Enter no. of red balls taken out");
		int redBalls = sc.nextInt();
		int probability = countProbability(ballsTakenOut, redBalls);
		System.out.println(probability);
	}
	
	public static int countProbability(int totalBalls, int redBalls) {
		int probability = 0;
		if(redBalls <= 4 && redBalls <= totalBalls) {
			probability = (int)(((double)redBalls) * 100/ totalBalls);
			return probability;
		}
		return probability;
	}

}
