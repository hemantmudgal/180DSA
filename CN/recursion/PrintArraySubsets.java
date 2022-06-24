/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-06-2022
 *   Time: 09:24
 *   File: PrintArraySubsets.java
 */

package CN.recursion;

public class PrintArraySubsets {

    public static void findArraySubsets(int[] array, int index, int[] output){
        if(index == array.length){
            for (int i : output) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        int[] newOutput = new int[output.length + 1];
        int i = 0;
        for (; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[i] = array[index];
        findArraySubsets(array,index+1,output);
        findArraySubsets(array,index+1,newOutput );
    }

    public static void findArraySubsets(int[] array, int index){
        int[] output = {};
        findArraySubsets(array,index,output);
    }

    public static void main(String[] args) {
        int[] array = {15,12,20};
        findArraySubsets(array, 0);
    }
}