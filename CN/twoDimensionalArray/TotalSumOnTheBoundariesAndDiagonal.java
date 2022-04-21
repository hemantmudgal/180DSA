/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 13:00
 *   File: TotalSumOnTheBoundryAndDiagonal.java
 */

package CN.twoDimensionalArray;

public class TotalSumOnTheBoundariesAndDiagonal {
    private static int totalSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == 0 || i == array.length-1){
                for (int j = 0; j < array[0].length; j++) {
                    sum += array[i][j];
                }
            }else{
                sum += array[i][0] + array[i][array[0].length-1];
            }
        }

        for (int i = 1; i < array.length-1; i++) {
                for (int j = 1; j < array[0].length - 1; j++) {
                    if(i == j){
                        sum += array[i][j];
                    }
                }
        }

        for (int i = 1; i < array.length-1; i++) {
            for (int j = array[0].length-2; j >=1 ; j--) {
                if (i != j && i+j == array.length -1 ) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(totalSum(array));
    }
}