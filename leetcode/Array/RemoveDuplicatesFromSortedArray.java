/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-03-2022
 *   Time: 15:36
 *   File: RemoveDuplicatesFromSortedArray.java
 */

package leetcode.Array;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums){
        int putAtIndex = 1;
        int totalCount = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[putAtIndex] = nums[i];
                putAtIndex++;
            }
        }
        return putAtIndex;
    }

    public static void main(String[] args) {
        int[] array ={1,1,2};
        int value = removeDuplicates(array);
        System.out.println(value);
    }
}