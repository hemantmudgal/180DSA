/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 07-07-2022
 *   Time: 13:44
 *   File: PairUse.java
 */

package CN.object_oriented_programming.generics;

public class PairUse {
    public static void main(String[] args){
        Pair<String,Integer> p = new Pair<>("String1",1);
        p.setFirst("Hello");
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());

        int a = 2;
        int b = 3;
        int c = 4;

        Pair<Integer, Integer> internalPair = new Pair<>(a,b);
        Pair<Pair<Integer,Integer>,Integer> p3 = new Pair<>(internalPair,c);
        System.out.println(p3.getFirst().getSecond());
        System.out.println(p3.getSecond());
    }
}