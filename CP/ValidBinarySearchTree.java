/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 25-04-2022
 *   Time: 10:11
 *   File: ValidBinarySearchTree.java
 */

package CP;

public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        boolean left = isValidBST(root.left);
        boolean right = isValidBST(root.right);
        long max = max(root.left);
        long min = min(root.right);
        if(left && right && (max < root.val && min > root.val)){
            return true;
        }
        return false;
    }

    public long max(TreeNode root) {
        if (root == null) {
            return Long.MIN_VALUE;
        }
        long m = max(root.right);

        return Math.max(m, root.val);
    }

    public long min(TreeNode root) {
        if (root == null) {
            return Long.MIN_VALUE;
        }
        long m = min(root.left);
        return Math.min(m, root.val);
    }
}