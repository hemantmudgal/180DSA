/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 11-06-2022
 *   Time: 23:23
 *   File: removeX.java
 */

package CN.recursion;

public class removeX {

    public static String removeAllX(String str){
        String mainString;
        if(str.length() == 0){
            return"";
        }

        String smallAns = removeAllX(str.substring(1));
        if(str.charAt(0) == 'x'){
            mainString = smallAns;
        }else{
            mainString = str.charAt(0) + smallAns;
        }
        return mainString;
    }
    public static void main(String[] args){
        String str = "xaxb";
        System.out.println(removeAllX(str));
    }
}