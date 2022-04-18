/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-04-2022
 *   Time: 15:20
 *   File: SumRootToLeafNode.java
 */

package CP;

public class SumRootToLeafNode {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int sumNumbers(TreeNode root) {
            return SN(root, 0);
        }

        public int SN(TreeNode root, int curr) {
            if (root == null) {
                return 0;
            }

            if (root.left == null && root.right == null) {
                return curr * 10 + root.val;
            }

            int left = SN(root.left, curr * 10 + root.val);
            int right = SN(root.right, curr * 10 + root.val);
            return left + right;
        }
    }
}