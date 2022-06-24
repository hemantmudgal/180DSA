/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 24-06-2022
 *   Time: 14:29
 *   File: ReturnSubsetSumToK.java
 */

package CN.recursion;

public class ReturnSubsetSumToK {


    public static int[][] findSubsets(int[] array,int sum){
        return helper(array,sum, 0);
    }

    public static int[][] helper(int[] array, int sum, int index){
       if(index == array.length){
           if(sum == 0){
               return new int[1][0];
           }else{
               return new int [0][0];
           }
       }

       int[][] smallAns1 = helper(array,sum-array[index],index+1);
       int[][] smallAns2 = helper(array,sum,index+1);
       int[][] output = new int[smallAns1.length + smallAns2.length][];

       int k = 0;
        for(int i=0;i<smallAns2.length;i++){
            output[i]=new int[smallAns2[i].length];
            for(int j=0;j<smallAns2[i].length;j++)
                output[k][j]=smallAns2[i][j];////////
            k++;
        }

        for (int i = 0; i < smallAns1.length; i++) {
            output[k+i] = new int[smallAns1[i].length + 1];
            output[k+i][0] = array[index];
            for (int j = 1; j <= smallAns1[i].length; j++) {
                output[k+i][j] = smallAns1[i][j-1];
            }
        }
        return  output;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int sum = 5;
        int[][] output = findSubsets(array, sum);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}