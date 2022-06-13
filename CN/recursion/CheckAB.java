/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 13-06-2022
 *   Time: 14:54
 *   File: CheckAB.java
 */

package CN.recursion;

public class CheckAB {

    public static boolean checkAB(String str){
        if(str.length() == 0){
            return true;
        }

        if(str.charAt(0) == 'a'){
            if (str.substring(1).length() > 1 && str.substring(1,3).equals("bb")){
                return checkAB(str.substring(3));
            }else{
                return checkAB(str.substring(1));
            }
        }
        return  false;
    }

    public static void main(String[] args){
        String str = "abbaba";
        boolean output = checkAB(str);
        System.out.println(output);
    }
}