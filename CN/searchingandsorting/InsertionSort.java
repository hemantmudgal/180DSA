/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-04-2022
 *   Time: 09:14
 *   File: InsertionSort.java
 */

package CN.searchingandsorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 4, 3, 5, 2};
        insertionSort(array.length, array);
        System.out.println(Arrays.toString(array));
    }
}