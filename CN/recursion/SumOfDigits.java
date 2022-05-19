/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 19-05-2022
 *   Time: 07:47
 *   File: SumOfDigits.java
 */

package CN.recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sum = 0;
    public static int sumOfDigits(int value){
        if(value < 10){
            return value;
        }

        sum = value % 10 + sumOfDigits(value / 10);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(sumOfDigits(value));
    }
}