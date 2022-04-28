/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 28-04-2022
 *   Time: 11:32
 *   File: MergeKSortedList.java
 */

package leetcode.Array;

import java.util.PriorityQueue;

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>();

        @Override
        public int Compare(ListNode o1, ListNode o2){
            return o1.val - o2.val;
        }

        ListNode temp = new ListNode();
        ListNode ans = temp;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }
        while (!pq.isEmpty()) {
            ListNode rv = pq.poll();
            temp.next = rv;
            temp = temp.next;
            if(rv.next != null){
                pq.add((rv.next));
            }
        }
        return ans.next;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}