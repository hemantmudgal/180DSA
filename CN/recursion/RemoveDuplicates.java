/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-05-2022
 *   Time: 10:28
 *   File: RemoveDuplicates.java
 */

package CN.recursion;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        if(str.length() <= 1){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return  removeDuplicates(str.substring(1));
        }else{
            return str.charAt(0) + removeDuplicates(str.substring(1));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeDuplicates(str));
    }
}