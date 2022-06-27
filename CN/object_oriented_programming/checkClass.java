/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-06-2022
 *   Time: 10:16
 *   File: chekerClass.java
 */

package CN.object_oriented_programming;

public class checkClass {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3,5);
        fraction1.print();
        System.out.println(fraction1.getNumerator());
        System.out.println(fraction1.getDenominator());
        Fraction fraction2 = new Fraction(13, 12);
        fraction1.multiply(fraction2);
        fraction1.print();
        Fraction fraction3 = new Fraction(1,2);
        fraction1.add(fraction3);
        fraction1.print();
        fraction1 = new Fraction(1,2);
        fraction2 = new Fraction(1,2);
        Fraction output = Fraction.add(fraction1,fraction2);
        output.print();
    }
}