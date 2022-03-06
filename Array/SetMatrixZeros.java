package Array;

/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 06-03-2022
 *   Time: 17:04
 *   File: Array.SetMatrixZeros.java
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        int col0=1;
        int col = matrix[0].length;
        int row = matrix.length;

        for(int i=0;i<row;i++){
            if(matrix[i][0] == 0){
                col0 = 0;
            }
            for(int j=1;j<col;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=1;j--){
                if(matrix[i][0] == 0 || matrix[0][j] ==0){
                    matrix[i][j] = 0;
                }
            }
            if(col0 == 0){
                matrix[i][0] = 0;
            }
        }

    }

    public static void print2DArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void main(String[] args) {
        int[][] twoDMatrix = {{1,2,3}, {1, 0, 2},{6,3,2}};
        setZeroes(twoDMatrix);
        print2DArray(twoDMatrix);

    }
}