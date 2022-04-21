/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 12:25
 *   File: JaggedArray.java
 */

package CN.twoDimensionalArray;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+2];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}