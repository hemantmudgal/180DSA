/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 19:24
 *   File: ArrayInterSection.java
 */

package CN.timeComplexity;

import java.util.Arrays;

public class ArrayInterSection {
    public static void arrayInterSection(int[] array1, int[] array2) {

        if (array1.length == 0 || array2.length == 0) {
            return;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);
        int i = 0;
        int j = 0;

        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                i++;
            }else if(array1[i] > array2[j]){
                j++;
            }else{
                System.out.println(array1[i]);
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args){
        int[] array1 = {1,2,3,4,2};
        int[] array2 = {2,6,1,2};
        arrayInterSection(array1,array2);
    }
}