/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 14:26
 *   File: InsertIntoBinarySearchTreeLeetCode701.java
 */

package CP;

public class InsertIntoBinarySearchTreeLeetcode701 {

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }

        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }else{
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}