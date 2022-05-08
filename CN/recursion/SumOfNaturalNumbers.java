/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 13:32
 *   File: SumOfNaturalNumber.java
 */

package CN.recursion;

public class SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers(int n){
        if(n == 1) return 1;

        return sumOfNaturalNumbers(n-1) + n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNaturalNumbers(5));
    }
}