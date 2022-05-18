/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-05-2022
 *   Time: 23:25
 *   File: GeometricSum.java
 */

package CN.recursion;

import java.util.Scanner;

public class GeometricSum {
    public static double geometricSum(int value) {
        double sum = 0;
        if(value == 0){
            return 1;
        }
        sum = 1 / Math.pow(2,value) + geometricSum(--value);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(geometricSum(value));
    }
}