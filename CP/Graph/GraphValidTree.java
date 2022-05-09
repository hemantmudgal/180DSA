/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-05-2022
 *   Time: 14:56
 *   File: ValidTree.java
 */

package CP.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class GraphValidTree {
    public boolean validTreeOrNot(int n, int[][] edges) {
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).put(v2, 1);
            map.get(v2).put(v1,1);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;

        queue.add(1);
        while (!queue.isEmpty()) {
            // remove
            int rv = queue.remove();
            // Ignore
            if (visited.contains(rv)) {
                return false;
            }

            // visited Mark
            visited.add(rv);

            // add nbrs
            for (int key : map.get(rv).keySet()) {
                if (visited.contains(key) == false) {
                    queue.add(key);
                }
            }
        }
        return count == 1;
    }
}