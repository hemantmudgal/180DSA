/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-04-2022
 *   Time: 21:20
 *   File: RotateArray.java
 */

package CN.searchingAndSorting.assignment;

import java.util.Arrays;

public class RotateArray {
   public static void rotateArray(int[] array, int index){
       for(int i = 0 ; i < index; i++){
           int temp = array[0];
           for(int j = 0; j <array.length-1;j++){

               array[j] = array[j+1];
           }
           array[array.length-1] = temp;
       }
   }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        int index = 4;
        rotateArray(array, index);
        System.out.println(Arrays.toString(array));
    }
}