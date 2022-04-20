/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-04-2022
 *   Time: 17:38
 *   File: SumOfTwoArray.java
 */

package CN.searchingAndSorting.assignment;

public class SumOfTwoArray {
    public static void sumOfTwoArray(int[] array1, int[] array2) {
        int[] sum = new int[Math.max(array1.length, array2.length)];
        int i = array1.length - 1;
        int j = array2.length - 1;
        int k = sum.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += array1[i];
            }

            if (j >= 0) {
                d += array2[j];
            }
            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.print(c);
        }

        for (int val : sum) {
            System.out.print(val);
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 0, 2, 2, 0};
        int[] array2 = {0, 8, 6, 5};
        sumOfTwoArray(array1, array2);
    }
}