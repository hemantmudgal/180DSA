/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-05-2022
 *   Time: 06:10
 *   File: AllIndices.java
 */

package CN.recursion;

import java.util.Arrays;

public class AllIndices {
    public static int[] allIndices(int[] array, int startIndex, int value){
        if(startIndex == array.length){
            int[] output = new int[0];
            return output;
        }

        int[] smallAns = allIndices(array, startIndex + 1, value);

        if(array[startIndex] == value){
            int[] output = new int[smallAns.length + 1];
            output[0] = startIndex;
            for (int i = 0; i < smallAns.length; i++) {
                output[i + 1] = smallAns[i];
            }
            return output;
        }
        return smallAns;
    }

    public static void main(String[] args) {
        int[] array = {5,6,5,5,6};
        int value = 5;
        int[] newArray = allIndices(array,0,value);
        System.out.println(Arrays.toString(newArray));
    }
}