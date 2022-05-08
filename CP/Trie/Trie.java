/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 05-05-2022
 *   Time: 10:51
 *   File: Trie.java
 */

package CP.Trie;

import java.util.HashMap;

public class Trie {
    public class Node{
        char ch;
        HashMap<Character, Node> children;
        boolean isTerminal;

        public Node(char ch) {
            this.ch = ch;
            children = new HashMap<>();
            isTerminal = false;
        }
    }
    private Node root;

    public Trie(){
        this.root = new Node('*');
    }

    public void insert(String word) {
        Node curr  = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(curr.children.containsKey(ch)){
                curr = curr.children.get(ch);
            }else{
                Node newNode = new Node(ch);
                curr.children.put(ch,newNode);
                curr = newNode;
            }
        }
        curr.isTerminal = true;
    }

    public boolean search(String word) {
        Node curr  = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!curr.children.containsKey(ch)){
                return false;
            }else{
                curr = curr.children.get(ch);
            }
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String prefix) {
        Node curr  = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if(!curr.children.containsKey(ch)){
                return false;
            }else{
                curr = curr.children.get(ch);
            }
        }
        return true;
    }
}