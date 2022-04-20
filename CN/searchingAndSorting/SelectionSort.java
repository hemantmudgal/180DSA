/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-04-2022
 *   Time: 07:39
 *   File: SeclectionSort.java
 */

package CN.searchingAndSorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array, int n){
        for(int i=0;i<n-1;i++){
            int min = array[i];
            int minIndex = i;

            for(int j=i+1;j<n;j++){
                if(min > array[j]){
                    min = array[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {7,2,9,6,1,5,4};
        selectionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}