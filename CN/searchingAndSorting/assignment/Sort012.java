/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-04-2022
 *   Time: 16:26
 *   File: Sort012.java
 */

package CN.searchingAndSorting.assignment;

import java.util.Arrays;

public class Sort012 {
    public static void sort012(int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length - 1;
        int temp;

        while (mid <= high) {
            switch (array[mid]) {
                case 0: {
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = array[high];
                    array[high] = array[mid];
                    array[mid] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 1, 2, 0};
        sort012(array);
        System.out.println(Arrays.toString(array));
    }
}