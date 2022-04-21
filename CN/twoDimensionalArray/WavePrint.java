/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 01:10
 *   File: WavePrint.java
 */

package CN.twoDimensionalArray;

import java.util.Arrays;

public class WavePrint {

    public static int[] sineWavePrint(int[][] array){
        int[] arr = {};
        if(array.length == 0){
            return arr;
        }
        arr = new int[array.length * array[0].length];
        int count = 0;
        for (int i = 0; i < array[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    arr[count] = array[j][i];
                    count++;
                }
            }else{
                for (int j = array.length - 1; j >= 0 ; j--) {
                    arr[count] = array[j][i];
                    count++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(Arrays.toString(sineWavePrint(array)));;
    }
}