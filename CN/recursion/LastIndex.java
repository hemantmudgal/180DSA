/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 21:41
 *   File: LastIndex.java
 */

package CN.recursion;

public class LastIndex {
    public static int lastIndex(int[] array, int startIndex, int value){
        if(startIndex == array.length){
            return -1;
        }

        int ans = lastIndex(array, startIndex+1,value);

        if (ans != -1) {
            return ans;
        }

        if(array[startIndex] == value){
            return startIndex;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array = {5,5,6,5,6};
        int value = 6;
        System.out.println(lastIndex(array,0, value));
    }
}