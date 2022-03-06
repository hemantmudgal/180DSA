/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 07-03-2022
 *   Time: 00:24
 *   File: NextPermutation.java
 */

package Array;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        if(i >= 0){
            int j = nums.length  - 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length-1);
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverse(int[] array, int i, int j){
        while(j > i) swap(array, i++, j--);
    }

    public static void main(String[] args) {
        int[] array = {1,8,9};
        nextPermutation(array);
        System.out.println(Arrays.toString(array));
    }
}