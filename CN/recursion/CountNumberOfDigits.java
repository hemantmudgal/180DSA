/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 14:10
 *   File: CountNumberOfDigits.java
 */

package CN.recursion;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static int countNumberOfDigits(int number){
        if (number == 0) {
            return 0;
        }
        int smallAns = countNumberOfDigits(number / 10);
        return smallAns + 1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println(countNumberOfDigits(number));
    }
}