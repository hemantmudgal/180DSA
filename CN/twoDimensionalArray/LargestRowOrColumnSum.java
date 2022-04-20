/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-04-2022
 *   Time: 23:06
 *   File: LargestRowOrColumnSum.java
 */

package CN.twoDimensionalArray;

public class LargestRowOrColumnSum {

    public static void largestRowOrColumnSum(int[][] array){
        int row = array.length;
        int cols = array[0].length;
        int[] rows = new int[row];
        int[] columns = new int[cols];
        int rowMax = Integer.MIN_VALUE;
        int colMax = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < row;i++){
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
            }
            rows[i] = rowSum;
            if(rowMax < rows[i]){
                rowMax = rows[i];
                index = i;
            }
        }

        for (int i = 0; i < cols; i++) {
            int colSum = 0;
            for (int j = 0; j < row; j++) {
                colSum += array[j][i];
            }
            columns[i] = colSum;
            if(colMax < colSum){
                colMax = colSum;
                index = i;
            }
        }

        if(rowMax < colMax)
            System.out.println("Col has maximum value as " + colMax + " At row number " + index);
        else
            System.out.println("Row has maximum value as " + rowMax + " At row number " + index);
    }

    public static void main(String[] args) {
        int[][] array = {{2,8,9},{1,4,7},{2,8,9}};
        largestRowOrColumnSum(array);
    }
}