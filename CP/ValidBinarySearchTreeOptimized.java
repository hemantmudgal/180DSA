/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 25-04-2022
 *   Time: 10:47
 *   File: ValidBinarySearchTreeOptimized.java
 */

package CP;

class ValidBinarySearchTreeOptimized {

    public BstPair valid(TreeNode node){

        if(node == null){
            return new BstPair();
        }

        BstPair lbstp = valid(node.left);
        BstPair rbstp = valid(node.right);
        BstPair sbstp = new BstPair();
        sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, node.val));
        sbstp.max = Math.max(lbstp.max, Math.min(rbstp.max, node.val));
        if(lbstp.isbst && rbstp.isbst && (lbstp.max < node.val && rbstp.min > node.val)){
            sbstp.isbst = true;
            return sbstp;
        }
        sbstp.isbst = false;
        return sbstp;

    }
}