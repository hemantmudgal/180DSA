/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 27-06-2022
 *   Time: 11:03
 *   File: ComplexNumber.java
 */

package CN.object_oriented_programming;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    public ComplexNumber(int realPart, int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public int getRealPart(){
        return realPart;
    }

    public int getImaginaryPart(){
        return imaginaryPart;
    }

    public void setRealPart(int realPart){
        this.realPart = realPart;
    }

    public void setImaginaryPart(int imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }

    public void print(){
        if(imaginaryPart > 0) {
            System.out.println(realPart + "+" + imaginaryPart + "i");
        }else{
            System.out.println(realPart + "" + imaginaryPart  + "i");
        }
    }

    public void add(ComplexNumber cn){
        this.realPart = this.realPart + cn.realPart;
        this.imaginaryPart = this.imaginaryPart + cn.imaginaryPart;
    }

    public void multiply(ComplexNumber cn){
        this.realPart = this.realPart * cn.realPart;
        this.imaginaryPart = this.imaginaryPart * cn.imaginaryPart;
    }

    public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2){
        int realPart = cn1.realPart + cn2.realPart;
        int imaginary = cn2.imaginaryPart + cn1.imaginaryPart;
        ComplexNumber newComplexNumber = new ComplexNumber(realPart, imaginary);
        return newComplexNumber;
    }

    public void conjugate(){
        this.imaginaryPart = -1 * (this.imaginaryPart);
    }
}