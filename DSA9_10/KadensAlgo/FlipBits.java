/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 18-04-2022
 *   Time: 14:21
 *   File: FlipBits.java
 */

package DSA9_10.KadensAlgo;

public class FlipBits {
    public static int flipBits(int[] arr, int n) {
        //Write your code here
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {

                count++;

                arr[i] = -1;

            } else {

                arr[i] = 1;

            }

        }

        int currentsum = 0;

        int maximumsum = 0;

        for (int i = 0; i < n; i++) {

            currentsum += arr[i];

            if (currentsum >= maximumsum) {

                maximumsum = currentsum;

            }

            if (currentsum < 0) {

                currentsum = 0;

            }

        }

        return count + maximumsum;
    }
}