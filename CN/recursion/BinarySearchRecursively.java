/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-06-2022
 *   Time: 17:38
 *   File: BinarySearchRecursively.java
 */

package CN.recursion;

public class BinarySearchRecursively {

    public static int findElement(int[] array, int value, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;
        if(array[mid] == value){
            return mid;
        }
        else if(array[mid] < value){
            return findElement(array,value, mid+1,end);
        }else{
            return findElement(array,value,start,mid-1);
        }
    }

    public static void main(String[] args){
        int value = 5;
        int[] array = {2, 3, 4, 5, 6, 8};
        int index = findElement(array, value,0,array.length);
        System.out.println(index);
    }
}