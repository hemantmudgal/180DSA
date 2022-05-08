/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 17:53
 *   File: ArraySortedOrNot.java
 */

package CN.recursion;

public class ArraySortedOrNot {
    public static boolean checkSorted(int[] array){
        if(array.length <= 1){
            return true;
        }
        if(array[0] > array[1]){
            return false;
        }
        int[] smallInput = new int[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            smallInput[i-1] = array[i];
        }
        boolean smallAns = checkSorted(smallInput);
        return smallAns;
    }

    public static boolean checkSortedBetter(int[] array, int startIndex){
        if(startIndex == array.length -1 ){
            return true;
        }

        if(array[startIndex] > array[startIndex + 1]){
            return false;
        }

        boolean smallAns = checkSortedBetter(array, startIndex + 1);
        return smallAns;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(checkSortedBetter(array,0));
    }
}