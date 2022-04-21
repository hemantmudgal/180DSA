/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 11:31
 *   File: BinarySearchTreeClient.java
 */

package CP;

public class BinarySearchTreeClient {
    public static void main(String[] args) {
        int[] in = {10,20,30,40,50,60,70,80,90};
        BinarySearchTree bst = new BinarySearchTree(in);
        bst.Display();
    }
}
