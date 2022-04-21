/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 11:16
 *   File: BinarySearchTree.java
 */

package CP;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(int[] in) {
        this.root = CreateTree(in,0, in.length-1);
    }

    private Node CreateTree(int[] in, int lo, int hi) {

        if (hi < lo) {
            return null;
        }

        int mid = (lo + hi) / 2;
        Node node = new Node(in[mid]);
        node.left = CreateTree(in, lo, mid - 1);
        node.left = CreateTree(in, mid + 1, hi);
        return node;
    }

    public void Display() {
        Display(this.root);
    }

    private void Display(Node node) {


        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        Display(node.left);
        Display(node.right);
    }

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}