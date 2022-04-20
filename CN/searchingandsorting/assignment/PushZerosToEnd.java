/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-04-2022
 *   Time: 18:37
 *   File: PushZerosToEnd.java
 */

package CN.searchingandsorting.assignment;

import java.util.Arrays;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int[] array = {9,0,0,8,2,2};
        pushZerosToEnd(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Problem Description:Given a random integer array, push all the zeros that are
     * present to the end of the array. The respective order of other elements should
     * remain the same.
     */

    public static void pushZerosToEnd(int[] array){
        int nonzero = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[nonzero];
                array[nonzero] = temp;
                nonzero++;
            }
        }
    }
}