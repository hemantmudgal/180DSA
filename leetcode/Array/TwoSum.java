/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-03-2022
 *   Time: 14:37
 *   File: TwoSum.java
 */

package leetcode.Array;

import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,65,6};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(array,target)));
    }
}