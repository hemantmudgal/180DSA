/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 12:21
 *   File: TripletSum.java
 */

package CN.timeComplexity;

import java.util.Arrays;

public class TripletSum {

    public static int tripletSum(int[] array, int value){
        Arrays.sort(array);
        int n = array.length;

        int numTriplet = 0;

        for(int i = 0; i < n; i++){
            int pairsumFor = value - array[i];
            int numPairs = pairSum(array,pairsumFor,i+1,n-1);
            numTriplet += numPairs;
        }
        return numTriplet;
    }

    public static int pairSum(int[] array, int value, int startIndex, int endIndex) {
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
        int[] array = {2, -5, 8, -6, 0, 5, 10, 11, -3};
        System.out.println(tripletSum(array,10));
    }
}