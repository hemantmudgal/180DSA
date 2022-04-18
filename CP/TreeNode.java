/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-04-2022
 *   Time: 10:41
 *   File: TreeNode.java
 */

package CP;

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}