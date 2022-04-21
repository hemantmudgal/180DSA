/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 14:53
 *   File: DeleteNodeInBinarySearchTree.java
 */

package CP;

public class DeleteNodeInBinarySearchTree {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null && key == 0) {
            return null;
        }
        return delete(root, key);
    }

    public TreeNode delete(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if(root.val < key){
            root.right = delete(root.right, key);
        }else if(root.val > key){
            root.left = delete(root.left, key);
        }else {
            if (root.left == null) {
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else {
                int max = max(root.left);
                root.left = delete(root.left,max);
                root.val = max;
            }
        }
        return root;
    }

    public int max(TreeNode root){
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int max = max(root.right);
        return Math.max(max, root.val);
    }
}