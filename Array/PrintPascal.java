/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 06-03-2022
 *   Time: 22:52
 *   File: PrintPascal.java
 */


package Array;

import java.util.*;

public class PrintPascal {
    public static List<List<Integer>> generate(int num) {
        List<Integer> row, pre = null;
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<num;i++) {
            row = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j-1) + pre.get(j));
            }
            pre = row;
            res.add(row);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(generate(number));
    }
}