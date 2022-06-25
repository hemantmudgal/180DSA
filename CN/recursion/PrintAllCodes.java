/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 25-06-2022
 *   Time: 11:34
 *   File: PrintAllCodes.java
 */

package CN.recursion;

public class PrintAllCodes {

    public static char getCode(int input){
        return (char)(input+96);
    }

    public static void helper(String str, String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }

        int firstDigit = str.charAt(0) - '0';
        helper(str.substring(1),output + getCode(firstDigit));

        if(str.length() > 1){
           int firstTwoDigit = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            if(firstTwoDigit >= 10 && firstTwoDigit <= 26){
                helper(str.substring(2),output + getCode(firstTwoDigit));
            }
        }
    }

    public static void printAllCodes(String str){
        helper(str, "");
    }

    public static void main(String[] args) {
        String str = "1123";
        printAllCodes(str);
    }
}