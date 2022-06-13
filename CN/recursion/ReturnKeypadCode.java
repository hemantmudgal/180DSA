/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-06-2022
 *   Time: 10:00
 *   File: ReturnKeypadCode.java
 */

package CN.recursion;

import java.util.Arrays;

public class ReturnKeypadCode {

    public static String[] findKeypadSubSequences(int value) {
        String[] ans = {""};
        if(value == 0){
            return ans;
        }

        String[] smallAns = findKeypadSubSequences(value/10);
        String lastCharacter = getString(value % 10);
        ans = new String[smallAns.length * lastCharacter.length()];
        int k = 0;
        for (int i = 0; i < lastCharacter.length(); i++) {
            for (int j = 0; j < smallAns.length; j++) {
                ans[k] = smallAns[j] + lastCharacter.charAt(i);
                k++;
            }
        }
        return ans;

    }

    public static String getString(int input){
        if(input == 2){
            return "abc";
        }
        if(input == 3){
            return "def";
        }
        if(input == 4){
            return "ghi";
        }
        if(input == 5){
            return "jkl";
        }
        if(input == 6){
            return "mno";
        }
        if(input == 7){
            return "pqr";
        }if(input == 8){
            return "ust";
        }if(input == 9){
            return "wxyz";
        }
        return " ";
    }

    public static void main(String[] args) {
        int value = 234;
        String[] array = findKeypadSubSequences(value);
        System.out.println(Arrays.toString(array));
    }
}