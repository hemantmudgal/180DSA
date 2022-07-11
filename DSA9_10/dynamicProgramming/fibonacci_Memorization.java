/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 11-07-2022
 *   Time: 10:21
 *   File: fibonaaci_Memorization.java
 */

package DSA9_10.dynamicProgramming;

import java.util.Scanner;

public class fibonacci_Memorization {

    public static int findFibonacciNo(int input, int[] dp){
        if(input <= 1){
            return input;
        }
        if(dp[input] != -1){
            return  dp[input];
        }

        return dp[input] = findFibonacciNo(input-1,dp) + findFibonacciNo(input - 2,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] dp = new int[input + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int output = findFibonacciNo(input,dp);
        System.out.println(output);
    }
}