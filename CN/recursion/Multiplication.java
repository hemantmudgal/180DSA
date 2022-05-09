/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-05-2022
 *   Time: 07:09
 *   File: Muliplication.java
 */

package CN.recursion;

import java.util.Scanner;

public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }

        return m + multiplyTwoIntegers(m, --n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(multiplyTwoIntegers(m,n));
    }
}