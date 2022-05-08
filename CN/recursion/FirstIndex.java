/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 19:48
 *   File: FirstIndex.java
 */

package CN.recursion;

public class FirstIndex {
    public static int firstIndex(int[] array, int startIndex, int value){
        if(startIndex == array.length){
            return -1;
        }

        if(array[startIndex] == value){
            return startIndex;
        }

        int ans = firstIndex(array, startIndex+1,value);
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {3,4,6,5,6};
        int value = 0;
        System.out.println(firstIndex(array,0, value));
    }
}