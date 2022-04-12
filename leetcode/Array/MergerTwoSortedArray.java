/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-03-2022
 *   Time: 17:26
 *   File: MergerTwoSortedArray.java
 */

package leetcode.Array;

import java.util.Arrays;

public class MergerTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 && n == 1){
            nums1 = nums2;
        }

        if(m == 0 && n == 0){
            return;
        }

        for (int i = 0; i < m; i++) {
            if (nums1[i] < nums2[0]) continue;
            else {
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
            }
            Arrays.sort(nums2);
        }
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (nums1[i] != 0) {
                break;
            }
            nums1[i] = nums2[--n];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3,5,6};
        int[] nums2 = {1};
        merge(nums1, nums1.length, nums2, nums2.length);
    }
}