/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-04-2022
 *   Time: 10:59
 *   File: SelectBag.java
 */

package DSA9_10.contest;

/*
You have 'N' bags of chocolates where each bag contains some positive number of chocolates, represented as an array 'A' of integers. Your task is to distribute all these chocolates among two children.
You want to keep some chocolates for yourself too, so you take exactly one bag for yourself. Find the number of ways to choose the bag such that it is possible to divide the remaining chocolates equally among both children.
 */

public class SelectBag {
    public static int chooseBag(int n, int a[]) {
        int sum = 0;
        int count = 0;
        for(int i = 0 ; i < a.length;i++){
            sum += a[i];
        }

        for(int i = 0; i<a.length;i++){
            if((sum - a[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}