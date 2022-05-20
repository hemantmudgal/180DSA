/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-05-2022
 *   Time: 09:53
 *   File: ReplaceCharacter.java
 */

package CN.recursion;

import java.util.Scanner;

public class ReplaceCharacter {

    public static String replaceCharacter(String str, char ch1, char ch2){
        if(str.length() == 0){
            return str;
        }
        String ans = "";
        if(str.charAt(0) != ch1){
            ans += str.charAt(0);
        }else{
            ans += ch2;
        }
        return ans + replaceCharacter(str.substring(1),ch1,ch2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);
        System.out.println(replaceCharacter(string,ch1,ch2));
    }
}