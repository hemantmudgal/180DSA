/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 19-05-2022
 *   Time: 00:01
 *   File: checkPalindrome.java
 */

package CN.recursion;

import java.util.Scanner;

public class checkPalindrome {

    public static boolean palindromeOrNot(String str){
        if(str.length() <= 1){
            return true;
        }

        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        return palindromeOrNot(str.substring(1,str.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindromeOrNot(str));
    }
}