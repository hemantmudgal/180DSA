/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 07-07-2022
 *   Time: 13:41
 *   File: Pair.java
 */

package CN.object_oriented_programming.generics;

public class Pair<T,V> {
    private T first;
    private V second;

    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public V getSecond(){
        return this.second;
    }

    public void setFirst(T value){
        this.first = value;
    }

    public void setSecond(V value){
        this.second = value;
    }
}