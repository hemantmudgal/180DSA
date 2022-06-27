/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-06-2022
 *   Time: 10:16
 *   File: chekerClass.java
 */

package CN.object_oriented_programming;

public class Main {

    public static void fraction(){
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

    public static void complexNumber(){
        ComplexNumber cn = new ComplexNumber(1,2);
        cn.print();
        cn.setImaginaryPart(1);
        cn.setRealPart(2);
        System.out.println(cn.getRealPart());
        System.out.println(cn.getImaginaryPart());
        cn.print();
        ComplexNumber cn2 = new ComplexNumber(2,1);
        cn.add(cn2);
        cn.print();
        cn.multiply(cn2);
        cn.print();
        cn.conjugate();
        cn.print();
        ComplexNumber output = ComplexNumber.add(cn,cn2);
        output.print();
    }

    public static void dynamicArray(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(9);
        dynamicArray.print();
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getData(2));
        dynamicArray.setData(2,2);
        dynamicArray.print();
        dynamicArray.removeLast();
        dynamicArray.print();
        System.out.println(dynamicArray.size());
    }

    public static void main(String[] args) {
        fraction();
        System.out.println();
        System.out.println();
        complexNumber();
        System.out.println();
        System.out.println();
        dynamicArray();
    }
}