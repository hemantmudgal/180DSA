/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 15-04-2022
 *   Time: 00:01
 *   File: KadanesAfterKthConcatnaion.java
 */

package Array;

import java.util.ArrayList;

public class KadanesAfterKthConcatination {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        System.out.println(maxSubSumKConcat(arr, arr.size(), 3));
    }
    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        int count = 0;
        int max1 = Integer.MIN_VALUE;
        for (int value : arr) {
            if(max1 < value){
                max1 = value;
            }
            if (value < 0) {
                count++;
            }
        }

        if (count == arr.size()) {
            return max1;
        }


        for (int i = 0; i < k - 1; i++) {
            for(int j = 0; j < n; j++){
                arr.add(arr.get(j));
            }
        }

        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < arr.size(); i++) {
            curr += arr.get(i);
            if (curr < 0) {
                curr = 0;
            }
            max = Math.max(curr, max);
        }
        return max;
    }
}