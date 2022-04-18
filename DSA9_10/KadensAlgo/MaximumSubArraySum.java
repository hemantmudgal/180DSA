/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-04-2022
 *   Time: 14:20
 *   File: MaximumSubArraySum.java
 */

package DSA9_10.KadensAlgo;

public class MaximumSubArraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        long sum = (long)0;
        long max = Long.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            if(sum < 0)
                sum = 0;
            max = Math.max(sum, max);
        }
        return max;
    }
}