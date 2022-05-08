/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 18:20
 *   File: SumOfArray.java
 */

package CN.recursion;

public class SumOfArray {

    public static int sumOfArray(int[] array, int index){
        if(index == array.length){
            return 0;
        }
        return array[index] + sumOfArray(array, index+1);
    }

    public static void main(String[] args) {
        int[] array = {7,2,-9,-7};
        System.out.println(sumOfArray(array,0));
    }
}