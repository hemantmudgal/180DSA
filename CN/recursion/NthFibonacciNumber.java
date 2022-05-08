/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 17:16
 *   File: NthFibonacciNumber.java
 */

package CN.recursion;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static int nthFibonacciNumber(int nthNumber) {
        if(nthNumber == 0 || nthNumber == 1){
            return nthNumber;
        }
        return nthFibonacciNumber(nthNumber - 1) + nthFibonacciNumber(nthNumber - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nthNumber = sc.nextInt();
        System.out.println(nthFibonacciNumber(nthNumber));
    }
}