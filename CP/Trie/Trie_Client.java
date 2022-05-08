/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 05-05-2022
 *   Time: 10:57
 *   File: Trie_Client.java
 */

package CP.Trie;

public class Trie_Client {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("himanshu");
        System.out.println(trie.search("him"));
        trie.startsWith("hi");
    }
}