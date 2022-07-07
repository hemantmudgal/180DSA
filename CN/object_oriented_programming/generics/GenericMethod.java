/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 07-07-2022
 *   Time: 14:29
 *   File: GenericMethod.java
 */

package CN.object_oriented_programming.generics;

public class GenericMethod {

    public static <T> void print(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = "abc";
        }
        print(array);
    }
}