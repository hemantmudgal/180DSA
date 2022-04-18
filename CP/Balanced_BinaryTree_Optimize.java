/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-04-2022
 *   Time: 11:32
 *   File: Balanced_BinaryTree_Optmize.java
 */

package CP;

public class Balanced_BinaryTree_Optimize {
    public class BalancePair {
        boolean isbal = true;
        int ht = -1;

        public boolean isBalanced(TreeNode root) {
            return isBalanced(root);
        }
    }


    class Solution {
        public BalancePair isbalance(TreeNode root) {

            if(root == null){
                return new BalancePair();
            }

            BalancePair lbp = isbalance(root.left);
            BalancePair rbp = isbalance(root.right);
            BalancePair sbp = new BalancePair();
            sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
            int bf = Math.abs(lbp.ht - rbp.ht);
            sbp.isbal = lbp.isbal && rbp.isbal && bf <= 1;
            return sbp;
        }
    }
}