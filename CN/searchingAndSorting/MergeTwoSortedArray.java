/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-04-2022
 *   Time: 12:17
 *   File: MergerTwoSortedArray.java
 */

package CN.searchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static int[] afterMerging(int[] array1, int[] array2){
        int[] newArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int currentIndex = 0;

        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                newArray[currentIndex] = array1[i];
                i++;
                currentIndex++;
            }else{
                newArray[currentIndex] = array2[j];
                j++;
                currentIndex++;
            }
        }

        while (i < array1.length) {
            newArray[currentIndex] = array1[i];
            i++;
            currentIndex++;
        }

        while (j < array2.length) {
            newArray[currentIndex] = array2[j];
            j++;
            currentIndex++;
        }

        return newArray;
    }
    
    public static int[] takeInput(){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int sizeOfFirstArray = sc.nextInt();
        int[] array = new int[sizeOfFirstArray];
        System.out.println("Enter the sorted array");
        for (int i = 0; i < sizeOfFirstArray; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    public static void main(String[] args){
        int[] array1 = takeInput();
        int[] array2 = takeInput();
        int[] newArray = afterMerging(array1, array2);
        System.out.println(Arrays.toString(newArray));
    }
}