/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-04-2022
 *   Time: 19:43
 *   File: LargestColumnSum.java
 */

package CN.twoDimensionalArray;

public class LargestColumnSum {
    public static int largestColumnSum(int[][] array){
        int rows = array.length;
        int cols = array[0].length;
        int largestSum = Integer.MIN_VALUE;

        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += array[j][i];
            }
            if (largestSum < sum) {
                largestSum = sum;
            }
        }
        return largestSum;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},{9, 8, 7,6},{3, 4, 5, 6},{-1, 1, -10, 5}};
        System.out.println(largestColumnSum(array));;
    }
}