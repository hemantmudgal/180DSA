/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-06-2022
 *   Time: 08:36
 *   File: ReturnArraySubsets.java
 */

package CN.recursion;
public class ReturnArraySubsets {

    public static int[][] findAllSubsets(int[] array, int index){
        if(index == array.length){
            int[][] output = new int[1][0];
            return output;
        }

        int[][] smallOutput = findAllSubsets(array, index + 1);
        int[][] output = new int[smallOutput.length * 2][];
        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            output[k] = new int[smallOutput[i].length];
            for (int j = 0; j < smallOutput[i].length; j++) {
                output[k][j] = smallOutput[i][j];
            }
            k++;
        }
        for (int i = 0; i < smallOutput.length; i++) {
           output[k] = new int[smallOutput[i].length + 1];
            output[k][0] = array[index];
            for (int j = 1; j <= smallOutput[i].length; j++) {
                output[k][j] = smallOutput[i][j-1];
            }
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] array = {15,20,12};
        int[][] output = findAllSubsets(array,0);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[0].length; j++) {
                System.out.println(output[i][j]);
            }
        }
    }
}