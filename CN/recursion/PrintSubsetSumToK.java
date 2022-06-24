/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 24-06-2022
 *   Time: 18:09
 *   File: PrintSubsetSumToK.java
 */

package CN.recursion;

public class PrintSubsetSumToK {

    public static void printSubset(int[] array, int sum){
        int[] output = {};
        helper(array,sum,output,0);
    }

    public static void helper(int[] array, int sum,int[] output, int index){
        if(index == array.length){
            if(sum == 0){
                for (int i : output) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }else{
                return;
            }
        }
        int[] newOutput = new int[output.length+1];
        int i = 0;
        for (; i < output.length; i++) {
            newOutput[i] = output[i];
        }
        newOutput[i] = array[index];
        helper(array,sum,output,index+1);
        helper(array,sum-array[index],newOutput,index+1);
    }


    public static void main(String[] args) {
        int[] array = {5,1,2,6,7,4,3};
        int sum = 9;
        printSubset(array, sum);
    }
}