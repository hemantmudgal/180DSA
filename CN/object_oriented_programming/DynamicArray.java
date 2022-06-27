/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-06-2022
 *   Time: 21:53
 *   File: DynamicArray.java
 */

package CN.object_oriented_programming;

public class DynamicArray {
    private static int nextElementIndex;
    private int[] data;

    public DynamicArray() {
        this.data = new int[5];
        nextElementIndex = 0;
    }

    public void add(int data) {
        if (nextElementIndex == this.data.length) {
            doubleCapacity();
            this.data[nextElementIndex] = data;
            nextElementIndex++;
        } else {
            this.data[nextElementIndex] = data;
            nextElementIndex++;
        }
    }

    private void doubleCapacity(){
        int[] temp = this.data;
        this.data = new int[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            this.data[i] = temp[i];
        }
    }

    public int size() {
        return nextElementIndex;
    }

    public int getData(int index) {
        if(index >= nextElementIndex){
            return -1;
        }
        return this.data[index];
    }

    public void setData(int index, int value) {
        this.data[index] = value;
    }

    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

    public void removeLast(){
        this.data[nextElementIndex-1] = 0;
        nextElementIndex--;
    }

    public void print(){
        for (int i = 0; i < nextElementIndex; i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }
}