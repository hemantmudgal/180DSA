/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-05-2022
 *   Time: 12:10
 *   File: MergeSort.java
 */

package CN.recursion;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = (startIndex + endIndex) / 2;
        mergeSort(array, startIndex, mid);
        mergeSort(array, mid + 1, endIndex);
        mergedArray(array, startIndex, endIndex);
    }

    public static void mergedArray(int[] array, int startIndex, int endIndex) {
        int size = endIndex - startIndex + 1;
        int mid = (startIndex + endIndex) / 2;
        int[] outputArray = new int[size];
        int i = startIndex;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= endIndex) {
            if (array[i] < array[j]) {
                outputArray[k] = array[i];
                i++;
            } else {
                outputArray[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            outputArray[k] = array[i];
            i++;
            k++;
        }

        while (j <= endIndex) {
            outputArray[k] = array[j];
            j++;
            k++;
        }
        int m = 0;
        for (int index = startIndex; index <= endIndex; index++) {
            array[index] = outputArray[m];
            m++;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1, 6};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}