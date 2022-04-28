/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 28-04-2022
 *   Time: 10:26
 *   File: KthLargestElementInArray.java
 */

package leetcode.Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length ; i++) {
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] array = {3,2,3,5,5,7};
        int value = findKthLargest(array,3);
        System.out.println(value);

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(78);
//        pq.add(7);
//        pq.add(8);
//        pq.add(4);
//        pq.add(3);
//        pq.add(-7);
//        pq.add(3);
//        pq.add(781);
//        System.out.println(pq.peek());;
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);
//        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
//        pq1.add(78);
//        pq1.add(7);
//        pq1.add(8);
//        pq1.add(4);
//        pq1.add(3);
//        pq1.add(-7);
//        pq1.add(3);
//        pq1.add(781);
    }
}