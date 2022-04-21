/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 14:47
 *   File: SearchInBinarySearchTree.java
 */

package CP;

public class SearchInBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }


        if(root.val < val){
            return searchBST(root.right,val);
        }else if(root.val > val){
            return searchBST(root.left,val);
        }else if(root.val == val){
            return root;
        }
        return null;
    }
}