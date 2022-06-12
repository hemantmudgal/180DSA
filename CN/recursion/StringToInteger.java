/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 11-06-2022
 *   Time: 23:49
 *   File: StringToInteger.java
 */

package CN.recursion;

public class StringToInteger {

    public static int convertStringToInt(String str){
        int finalAnswer;
        if(str.length() == 1){
            return str.charAt(0) - '0';
        }

        int smallAnswer = convertStringToInt(str.substring(0,str.length()-1));
        int lastDigit = str.charAt(str.length()-1) - '0';
        finalAnswer = smallAnswer * 10 + lastDigit;
        return finalAnswer;
    }

    public static void main(String[] args){
        String str = "1234567";
        System.out.println(convertStringToInt(str));
    }
}