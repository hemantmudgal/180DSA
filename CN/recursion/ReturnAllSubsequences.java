/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-06-2022
 *   Time: 09:29
 *   File: ReturnAllSubsequences.java
 */

package CN.recursion;

import java.util.Arrays;

public class ReturnAllSubsequences {
    public static String[] findSubsequences(String str){
        String[] ans = {""};

        if(str.length() == 0){
            return ans;
        }

        String[] smallAns = findSubsequences(str.substring(1));
         ans = new String[smallAns.length * 2];

        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];
        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }

    public static void main(String[] args){
        String str = "xyz";
        String[] output = findSubsequences(str);
        System.out.println(Arrays.toString(output));
    }
}