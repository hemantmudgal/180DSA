/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 11-06-2022
 *   Time: 22:28
 *   File: replacePi.java
 */

package CN.recursion;

public class replacePi {
    public static String replacePi(String str){
        String mainString;
        if(str.length() <= 1){
            return str;
        }

        String smallAns = replacePi(str.substring(1));
        if(str.charAt(0) == 'p' && smallAns.charAt(0) == 'i') {
            mainString = "3.14" + smallAns.substring(1);
        }else{
            mainString = str.charAt(0) + smallAns;
        }
        return mainString;
    }

    public static void main(String[] args) {
        String str = "pip";
        System.out.println(replacePi(str));
    }
}