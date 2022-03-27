/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-03-2022
 *   Time: 16:55
 *   File: PlusOne.java
 */

package leetcode.Array;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int i = digits.length-1;
        int sum = digits[i] + 1;
        digits[i] = sum % 10;
        i--;

        while(i >= 0){
            int carry = sum / 10;
            sum = digits[i] + carry;
            digits[i] = sum % 10;
            i--;
        }

        if(digits[0] == 0){
            int[] array = new int[digits.length + 1];
            array[0] = 1;
            for (int j = 1; j < digits.length; j++) {
                array[j] = digits[j];
            }
            return array;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] array = {9};
        array = plusOne(array);
        System.out.println(Arrays.toString(array));

    }
}