/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-04-2022
 *   Time: 08:21
 *   File: BubbleSort.java
 */

package CN.searchingAndSorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array, int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j+1] < array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 9, 4, 8, 3, 1};
        bubbleSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}