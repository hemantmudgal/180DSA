/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 22:06
 *   File: ArrayEquilibriumIndex.java
 */

package CN.timeComplexity;

public class ArrayEquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < array.length; i++) {
            rightSum += array[i];
        }
        if (rightSum == 0) {
            return 0;
        }
        for (int i = 1; i < array.length; i++) {
            leftSum += array[i - 1];
            rightSum -= array[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}