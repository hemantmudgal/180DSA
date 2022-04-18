/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-04-2022
 *   Time: 10:17
 *   File: Leetcode_543_DiameterOfBinaryTree.java
 */

package CP;


public class LeetCode_543_DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int sd = ht(root.left) + ht(root.right) + 2;
        return Math.max(sd, Math.max(rd, ld));
    }

    public static int ht(TreeNode temp){
        if(temp == null){
            return -1;
        }
        int lh = ht(temp.left);
        int rh = ht(temp.right);
        return Math.max(lh, rh);
    }
}