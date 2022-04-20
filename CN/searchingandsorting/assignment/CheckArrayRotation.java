/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-04-2022
 *   Time: 16:06
 *   File: CheckArrayRotation.java
 */

package CN.searchingandsorting.assignment;

public class CheckArrayRotation {


    public static void main(String[] args) {
        int[] array = {5,6,1,2,3,4};
        int index = checkArrayRotation(array);
        System.out.println(index);
    }

    private static int checkArrayRotation(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[i-1]){
                return i ;
            }
        }
        return index;
    }
}