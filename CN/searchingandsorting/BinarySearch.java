/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-04-2022
 *   Time: 00:30
 *   File: BinarySearch.java
 */

package CN.searchingandsorting;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(array[mid] == value)
                return mid;
            else if(array[mid] < value)
                start = mid + 1;
            else
                end = mid - 1;

        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] array = {6,10,32,35,40,45,60};
        int value = 60;
        int indexOfSearchValue = binarySearch(array, value);
        System.out.println("element found at index " + indexOfSearchValue);
    }
}