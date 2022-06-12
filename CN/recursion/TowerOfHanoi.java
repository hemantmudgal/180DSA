/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 12-06-2022
 *   Time: 10:45
 *   File: TowerOfHanoi.java
 */

package CN.recursion;

public class TowerOfHanoi {

    public static void printAllWays(int disk, char source, char auxiliary, char destination){
        if(disk == 0){
            return;
        }

        printAllWays(disk-1, source, destination, auxiliary);
        System.out.println(source + "->" + destination);
        printAllWays(disk-1,auxiliary,source,destination);
    }

    public static void main(String[] args){
        int disk = 3;
        char source = 'a';
        char destination = 'c';
        char auxiliary = 'b';
        printAllWays(disk, source,auxiliary, destination);
    }
}