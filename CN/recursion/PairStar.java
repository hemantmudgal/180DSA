/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 12-06-2022
 *   Time: 10:07
 *   File: PairStart.java
 */

package CN.recursion;

public class PairStar {

    public static String returnPairStar(String str) {
        String finalString;
        if(str.length() == 1){
            return "" + str.charAt(0);
        }
        String smallAns = returnPairStar(str.substring(1));
        if(str.charAt(0) == str.charAt(1)){
            finalString = str.charAt(0) + "*" + smallAns;
        }else{
            finalString = str.charAt(0) + smallAns;
        }
        return finalString;
    }

    public static void main(String[] args){
        String str = "aaaaa";
        System.out.println(returnPairStar(str));
    }
}