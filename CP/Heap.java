/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 25-04-2022
 *   Time: 15:04
 *   File: Heap.java
 */

package CP;

import java.util.ArrayList;

public class Heap {
    private final ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(5);
        hp.add(6);
        hp.add(7);
        hp.add(8);
        hp.add(5);
        hp.add(1);
        hp.add(7);
        hp.add(8);
        hp.add(-2);
        hp.add(10);
        hp.add(-1);
        hp.add(-4);
        System.out.println(hp.getMin());
        System.out.println(hp.remove());
        hp.display();


    }

    public void add(int item) {
        this.list.add(item);
        upheapify(this.list.size() - 1);
    }

    private void upheapify(int ci) {
        int pi = (ci - 1) / 2;

        if (this.list.get(pi) > this.list.get(ci)) {
            swap(ci, pi);
            upheapify(pi);
        }
    }

    public int remove() {
        swap(0, this.list.size() - 1);
        int rv = this.list.remove(this.list.size() - 1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi) {
        int c1 = 2 * pi * 1;
        int c2 = 2 * pi * 2;
        int mini = pi;

        if (c1 < this.list.size() && this.list.get(c1) < this.list.get(mini)) {
            mini = c1;
        }

        if (c2 < this.list.size() && this.list.get(c2) < this.list.get(mini)) {
            mini = c2;
        }

        if (mini != pi) {
            swap(mini, pi);
            downheapify(mini);
        }
    }

    public int getMin() {
        return this.list.get(0);
    }

    public void display() {
        System.out.println(this.list);
    }

    private void swap(int i, int j) {
        int ith = this.list.get(i);
        int jth = this.list.get(j);
        this.list.set(i, jth);
        this.list.set(j, ith);
    }
}