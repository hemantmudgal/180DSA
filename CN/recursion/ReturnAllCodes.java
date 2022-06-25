/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 24-06-2022
 *   Time: 22:54
 *   File: ReturnAllCodes.java
 */

package CN.recursion;

import java.util.Arrays;

public class ReturnAllCodes {

    public static char getCharacter(int input){
        return (char)(input + 96);
    }

    public static String[] findAllCodes(String str){
        if(str.length() == 0){
            String[] output = {""};
            return output;
        }
        int firstDigit = str.charAt(0) - '0';
        String[] smallOutput1 = findAllCodes(str.substring(1));
        String[] smallOutput2 = new String[0];
        int firstTwoDigit = 0;

        if (str.length() >= 2) {
            firstTwoDigit = ((str.charAt(0) - '0') * 10) + (str.charAt(1) -'0');
            if(firstTwoDigit >= 10 && firstTwoDigit <= 26){
                smallOutput2 = findAllCodes(str.substring(2));
            }
        }
        String[] output = new String[smallOutput1.length + smallOutput2.length];
        int k = 0;

        for (String out1 : smallOutput1) {
            output[k] = getCharacter(firstDigit) + out1;
            k++;
        }

        for (String out2 : smallOutput2) {
            output[k] = getCharacter(firstTwoDigit) + out2;
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        String str = "1123";
        String[] array = findAllCodes(str);
        System.out.println(Arrays.toString(array));
    }
}