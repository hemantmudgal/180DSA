/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 13:30
 *   File: Factorial.java
 */

package CN.recursion;

public class Factorial {
    public static int factorial(int n){
        if(n == 0) return 1;

        int smallAns = factorial(n-1);
        return n * smallAns;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}