/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-05-2022
 *   Time: 09:46
 *   File: removeCharacter.java
 */

package CN.recursion;

import java.util.Scanner;

public class RemoveCharacter {
    public static String removeCharacter(String str){
        if (str.length() == 0) {
            return str;
        }
        String ans = "";
        if(str.charAt(0) != 'x'){
            ans += str.charAt(0);
        }
        return ans + removeCharacter(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeCharacter(str));
    }
}