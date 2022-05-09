/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-05-2022
 *   Time: 07:16
 *   File: CountZeros.java
 */

package CN.recursion;

public class CountZeros {

    public static int count = 0;

    public static int countZerosRecursive(int[] array, int startIndex) {
        if(startIndex == array.length){
            return 0;
        }

        if(array[startIndex] == 0){
            count++;
        }

        int smallAns = countZerosRecursive(array,startIndex+1);

        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1,1,3,1};
        System.out.println(countZerosRecursive(array,0));
    }
}