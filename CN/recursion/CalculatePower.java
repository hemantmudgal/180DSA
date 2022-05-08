/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 13:41
 *   File: CalculatePower.java
 */

package CN.recursion;

import java.util.Scanner;

public class CalculatePower {
    public static int calculatePower(int x, int n){
        if(n == 0) {
            return 1;
        }
        return x * calculatePower(x,--n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value whose power to be calculated : ");
        int x = sc.nextInt();
        System.out.println("What power of value to be calculated : ");
        int n = sc.nextInt();
        System.out.println(calculatePower(x, n));
    }
}