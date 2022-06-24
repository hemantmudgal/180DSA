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
        int[][] smallAns = findAllSubsets(array, index + 1);
        int[][] output = new int[smallAns.length * 2][];

        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            output[k] =  new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                output[k][j] = smallAns[i][j];
            }
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            output[k] = new int[smallAns[i].length + 1];
            output[k][0] = array[index];
            for (int j = 1; j <= smallAns[i].length; j++) {
                output[k][j] = smallAns[i][j-1];
            }
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] array = {15,20,12};
        int[][] output = findAllSubsets(array,0);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}