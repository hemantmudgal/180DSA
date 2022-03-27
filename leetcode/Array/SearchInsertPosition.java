/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-03-2022
 *   Time: 16:19
 *   File: SerachInsertPosition.java
 */

package leetcode.Array;

public class SearchInsertPosition {
    public static  int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            }
        }

        return end + 1;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        int value = searchInsert(array,8);
        System.out.println(value);
    }
}