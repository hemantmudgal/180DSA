/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-04-2022
 *   Time: 14:28
 *   File: RotateArrayByExtraSpace.java
 */

package CN.searchingandsorting.assignment;

import java.util.Arrays;

public class RotateArrayByExtraSpace {
    public static void rotateArray(int[] array, int index){
        int[] newArray = new int[index];

        for(int i = 0; i < index;i++){
            newArray[i] = array[i];
        }

        int d = index;
        for(int i = 0;i < array.length-index; i++){
            array[i] = array[d];
            d++;
        }

        int count = 0;
        for(int i = array.length - index; i < array.length;i++){
            array[i] = newArray[count];
            count++;
        }
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int index = 4;
        rotateArray(array, index);
        System.out.println(Arrays.toString(array));
    }
}