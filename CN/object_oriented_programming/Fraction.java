/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-06-2022
 *   Time: 09:49
 *   File: Fraction.java
 */

package CN.object_oriented_programming;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;

        if(denominator == 0){
            return;
        }
        this.denominator = denominator;
        simplify();
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0){
            return;
        }
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
        simplify();
    }

    public void print(){
        if (denominator == 1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void add(Fraction fraction){
        this.numerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        this.denominator = this.denominator * fraction.denominator;
        simplify();
    }

    public void multiply(Fraction fraction){
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = fraction.denominator * this.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2){
        int newNumerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDenominator = f1.denominator * f2.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        return newFraction;
    }

    private void simplify() {
        int gcd = 1;
        int smallerValue = Math.min(numerator, denominator);
        for (int i = 2; i <= smallerValue; i++) {
            if (numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }

        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
}