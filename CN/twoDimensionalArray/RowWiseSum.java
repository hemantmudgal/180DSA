/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-04-2022
 *   Time: 18:59
 *   File: RowWiseSum.java
 */

package CN.twoDimensionalArray;

import java.util.Arrays;

public class RowWiseSum {
    public static int[] rowSum(int[][] array) {
        int[] arraySum = {0};
        if (arraySum.length == 0) {
            return arraySum;
        }
        arraySum = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraySum[i] += array[i][j];
            }
        }
        return arraySum;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},{9, 8, 7,6},{3, 4, 5, 6},{-1, 1, -10, 5}};
        int[] arraySum = rowSum(array);
        System.out.println(Arrays.toString(arraySum));
    }
}