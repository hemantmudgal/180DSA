/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-06-2022
 *   Time: 16:11
 *   File: StairCase.java
 */

package CN.recursion;

public class StairCase {

    public static int countTotalWays(int noOfStairs){
        if(noOfStairs < 0){
            return 0;
        }

        if(noOfStairs == 0){
            return 1;
        }

        int x = countTotalWays(noOfStairs-1);
        int y = countTotalWays(noOfStairs-2);
        int z = countTotalWays(noOfStairs-3);

        return x + y + z;
    }

    public static void main(String[] args) {
        int noOfStairs = 5;
        System.out.println(countTotalWays(noOfStairs));
    }
}