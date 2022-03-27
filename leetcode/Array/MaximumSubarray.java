/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-03-2022
 *   Time: 15:20
 *   File: MaximumSubarray.java
 */

package leetcode.Array;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) sum = 0;
            if (max < sum) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {-1,2,4,56,1};
        int value = maxSubArray(array);
        System.out.println(value);
    }
}