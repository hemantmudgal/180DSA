/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 08-05-2022
 *   Time: 14:00
 *   File: PrintNumbers.java
 */

package CN.recursion;

public class PrintNumbers {
    public static void print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 9;
        print(n);
    }
}