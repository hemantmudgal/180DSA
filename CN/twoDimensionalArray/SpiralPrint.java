/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 08:30
 *   File: SprialPrint.java
 */

package CN.twoDimensionalArray;

public class SpiralPrint {

    public static void printSpiralArray(int[][] array) {

        if (array.length == 0) {
            return;
        }

        if (array.length == 1) {
            for (int[] arr : array) {
                for (int value : arr) {
                    System.out.print(value + " ");
                }
            }
            return;
        }
        int count = 0;
        int rowStart = 0;
        int rowEnd = array.length;
        int colStart = 0;
        int colEnd = array[0].length;
        while (count < array.length * array[0].length) {
            for (int i = colStart; i < colEnd; i++) {
                System.out.print(array[rowStart][i] + " ");
                count++;
            }
            rowStart++;

            for (int i = rowStart; i < rowEnd; i++) {
                System.out.print(array[i][colEnd - 1] + " ");
                count++;
            }
            colEnd--;

            for (int i = colEnd - 1; i >= colStart; i--) {
                System.out.print(array[rowEnd - 1][i] + " ");
                count++;
            }
            rowEnd--;

            for (int i = rowEnd - 1; i >= rowStart; i--) {
                System.out.print(array[i][colStart] + " ");
                count++;
            }
            colStart++;
        }
    }

    public static void main(String[] args) {
        int[][] array = {{10, 20, 30}};
        printSpiralArray(array);
    }
}

//1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13