/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 14-04-2022
 *   Time: 15:08
 *   File: SecondLargestInArray.java
 */

package CN.searchingAndSorting.assignment;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] array = {-10, -40, -25, -12, -25, -10};
        int secondLargestInArray = secondLargestElement(array);
        System.out.println(secondLargestInArray);
    }

    public static int secondLargestElement(int[] array){

        if(array.length < 2)
            return Integer.MIN_VALUE;

        int maximum = array[0];
        int secondLargest = -Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if(maximum < array[i]){
                secondLargest = maximum;
                maximum = array[i];
            }else{
                if(secondLargest < array[i] && array[i] != maximum){
                    secondLargest = array[i];
                }
            }
        }
        return  secondLargest;
    }
}