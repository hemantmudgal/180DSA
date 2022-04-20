/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-04-2022
 *   Time: 14:42
 *   File: rotateArrayOptimized.java
 */

package CN.searchingandsorting.assignment;

import java.util.Arrays;

public class rotateArrayOptimized {

    public static void rotateArray(int[] array, int index){
        if(array.length == 0){
            return;
        }

        rotate(array,0,array.length-1);
        rotate(array,0, array.length - index - 1);
        rotate(array, array.length - index, array.length - 1 );
    }

    public static void rotate(int[] array, int start, int end){
        while(start < end){
            swap(array, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int index = 2;
        rotateArray(array, index);
        System.out.println(Arrays.toString(array));
    }

}