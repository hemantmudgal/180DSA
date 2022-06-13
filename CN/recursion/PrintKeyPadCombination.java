/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-06-2022
 *   Time: 12:32
 *   File: PrintKeyPadCombination.java
 */

package CN.recursion;

public class PrintKeyPadCombination {

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

    public static void printKeyPad(int input, String output){
        if(input == 0){
            System.out.println(output);
            return;
        }
        int lastNumber = input % 10;
        int smallNumber = input / 10;
        String str = getString(lastNumber);
        for (int i = 0; i < str.length(); i++){
            printKeyPad(smallNumber, str.charAt(i) + output);
        }

    }

    public static void main(String[] args){
        int input = 23;
        printKeyPad(input, "");
    }
}