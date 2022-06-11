/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 11-06-2022
 *   Time: 14:06
 *   File: QuickSort.java
 */

package CN.recursion;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] input, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;
        }

        int pivot = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivot-1);
        quickSort(input,pivot+1,endIndex);
    }

    public static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[startIndex];
        int count = 0;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if(input[i] < pivot){
                count++;
            }
        }
        int pivotPosition = count + startIndex;
        input[startIndex] = input[pivotPosition];
        input[pivotPosition] = pivot;

        int i = startIndex;
        int j = endIndex;

        while(i < pivotPosition && j > pivotPosition){
            if(input[i] <= input[pivotPosition]){
                i++;
            }else if(input[j] > input[pivotPosition]){
                j--;
            }else{
               int temp = input[i];
               input[i] = input[j];
               input[j] = temp;
                i++;
                j--;
            }
        }
        return pivotPosition;
    }

    public static void main(String[] args){
        int[]  array = {1,5,2,7,3};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}