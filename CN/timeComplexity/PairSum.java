/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 11:21
 *   File: PairSum.java
 */

package CN.timeComplexity;

import java.util.Arrays;

public class PairSum {


    private static int pairSum(int[] array, int value) {
        Arrays.sort((array));
        int startIndex = 1;
        int endIndex = array.length - 1;
        int numPair = 0;

        while(startIndex < endIndex){
            if(array[startIndex] + array[endIndex] < value){
                startIndex++;
            }else if(array[startIndex] + array[endIndex] > value){
                endIndex--;
            }else{
                int elementAtStart = array[startIndex];
                int elementAtEnd = array[endIndex];

                if(elementAtEnd == elementAtEnd){
                    int totalNumberOfPairFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += (totalNumberOfPairFromStartToEnd * (totalNumberOfPairFromStartToEnd - 1) / 2);
                    return numPair;
                }

                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;

                while(tempStartIndex <= tempEndIndex && array[tempStartIndex] == elementAtStart){
                    tempStartIndex++;
                }

                while(tempEndIndex >= tempStartIndex && array[tempEndIndex] == elementAtEnd){
                    tempEndIndex--;
                }

                int totalElementFromStart = tempStartIndex - startIndex;
                int totalElementFromEnd = endIndex - tempEndIndex;

                numPair += (totalElementFromEnd * totalElementFromStart);

                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
    }

    public static void main(String[] args) {
        int[] array = {1,3,3,4,5,9,9,9,3,2,1,16};
        int value = 7;
        System.out.println(pairSum(array, value));
    }

}