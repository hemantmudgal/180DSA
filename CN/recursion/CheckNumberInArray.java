/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 18:57
 *   File: CheckNumberInArray.java
 */

package CN.recursion;

public class CheckNumberInArray {
    public static boolean checkNumber(int[] array, int value){
        return checkNumber(array, 0, value);
    }

    public static boolean checkNumber(int[] array, int index, int value){

        if(index == array.length){
            return false;
        }

        if(value == array[index]){
            return true;
        }
        return checkNumber(array,index+1,value);
    }

    public static void main(String[] args) {
        int[] array = {9,5,6,10};
        int value = 8;
        System.out.println(checkNumber(array, value));
    }
}