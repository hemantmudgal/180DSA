/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 09-05-2022
 *   Time: 07:16
 *   File: CountZeros.java
 */

package CN.recursion;

import java.util.Scanner;

public class CountZeros {

    public static int count = 0;

    public static int countZerosRecursive(int value) {

        if(value < 10){
            if(value == 0){
                return 1;
            }else{
                return 0;
            }
        }

        if(value % 10 == 0){
            count = countZerosRecursive(value/10)+1;
        }else{
            count = countZerosRecursive(value/10);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(countZerosRecursive(value));
    }
}