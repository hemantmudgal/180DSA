/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 25-06-2022
 *   Time: 13:20
 *   File: RetrunPermutation.java
 */

package CN.recursion;

import java.util.Arrays;

public class ReturnPermutation {

    public static String[] findPermutation(String str) {
         if (str.length() == 0) {
                String[] output = {""};
                return output;
            }
            String[] smallOutput = findPermutation(str.substring(1));
            String[] output = new String[smallOutput.length * str.length()];
            int k = 0;
            for (int i = 0; i < smallOutput.length; i++) {
                String currentString = smallOutput[i];
                for (int j = 0; j <= currentString.length(); j++) {
                    output[k] = currentString.substring(0, j) + str.charAt(0) + currentString.substring(j);
                    k++;
                }
            }
            return output;
        }

        public static void main (String[]args){
            String str = "adg";
            String[] output = findPermutation(str);
            System.out.println(Arrays.toString(output));
        }
}