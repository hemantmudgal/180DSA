/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-04-2022
 *   Time: 10:53
 *   File: LeetCode_110_BalanceTree.java
 */

package CP;

public class LeetCode_110_BalanceTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        //boolean ld = isBalanced(root.left);
        // boolean rd = isBalanced(root.right);
        // int l = Math.abs(ht(root.left) - ht(root.right));

        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(ht(root.left) - ht(root.right)) <= 1;

    }

    public static int ht(TreeNode temp){
        if(temp == null){
            return -1;
        }
        int lh = ht(temp.left);
        int rh = ht(temp.right);
        return Math.max(lh, rh) + 1;
    }
}