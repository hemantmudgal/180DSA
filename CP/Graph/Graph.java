/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-05-2022
 *   Time: 10:23
 *   File: Graph.java
 */

package CP.Graph;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();

        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addedge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }

    public boolean haspath(int src, int dis, HashSet<Integer> visited) {

        if (src == dis) {
            return true;
        }

        visited.add(src);
        for (int key : map.get(src).keySet()) {
            if (!visited.contains(key)) {
                boolean ispath = haspath(key, dis, visited);
                if (ispath) {
                    return true;
                }
            }
        }
        visited.remove(src);
        return false;
    }

    public void PrintAllpath(int src, int dis, HashSet<Integer> visited, String str) {

        if (src == dis) {
            System.out.println(str + dis);
            return;
        }

        visited.add(src);
        for (int key : map.get(src).keySet()) {
            if (!visited.contains(key)) {
                PrintAllpath(key, dis, visited, str + src + " ");

            }
        }
        visited.remove(src);

    }

    public boolean BFS(int src, int dis) {

        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(src);
        while (!queue.isEmpty()) {
            // remove
            int rv = queue.remove();
            // Ignore
            if (visited.contains(rv)) {
                continue;
            }

            // visited Mark
            visited.add(rv);

            // check src==dis
            if (rv == dis) {
                return true;
            }

            // add nbrs
            for (int key : map.get(rv).keySet()) {
                if (visited.contains(key) == false) {
                    queue.add(key);
                }
            }

        }
        return false;
    }

    public boolean DFS(int src, int dis) {

        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            // remove
            int rv = st.pop();
            // Ignore
            if (visited.contains(rv)) {
                continue;
            }

            // visited Mark
            visited.add(rv);

            // check src==dis
            if (rv == dis) {
                return true;
            }

            // add nbrs
            for (int key : map.get(rv).keySet()) {
                if (visited.contains(key) == false) {
                    st.push(key);
                }
            }

        }
        return false;
    }

    public void BFT() {
        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            // remove
            int rv = queue.remove();
            // Ignore
            if (visited.contains(rv)) {
                continue;
            }

            // visited Mark
            visited.add(rv);

            System.out.print(rv + " ");
            // add nbrs
            for (int key : map.get(rv).keySet()) {
                if (visited.contains(key) == false) {
                    queue.add(key);
                }
            }

        }
    }

    public void DFT() {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            st.push(src);
            while(!st.isEmpty()){
                int rv = st.pop();
                if(visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
            }
        }
    }
}