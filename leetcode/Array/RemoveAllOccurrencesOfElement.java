/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-03-2022
 *   Time: 16:01
 *   File: RemoveAllOccurrencesOfElement.java
 */

package leetcode.Array;

public class RemoveAllOccurrencesOfElement {
    public static int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        int[] array  = {0,1,2,2,3,0,4,2};
        int value = removeElement(array,2);
        System.out.println(value);
    }

}