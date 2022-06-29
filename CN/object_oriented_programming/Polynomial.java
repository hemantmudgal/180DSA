/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 28-06-2022
 *   Time: 12:07
 *   File: Polynomial.java
 */

package CN.object_oriented_programming;

public class Polynomial {
   int[] degCoefficient;

   public Polynomial(){
       degCoefficient = new int[10];
   }

   public void setCoefficient(int degree, int coefficient){
       if(degree > degCoefficient.length-1){
           int[] temp = degCoefficient;
           degCoefficient = new int[degree+1];
           for (int i = 0; i < temp.length; i++) {
               degCoefficient[i] = temp[i];
           }
       }
       degCoefficient[degree] = coefficient;
   }

   public void print(){
       for (int i = 0; i < degCoefficient.length; i++) {
           if(degCoefficient[i] != 0){
               System.out.println(degCoefficient[i] + "x" + "^" + i + " +");
           }
       }
   }

   public Polynomial add(Polynomial p){
       Polynomial ans = new Polynomial();
       int plen1 = this.degCoefficient.length;
       int plen2 = p.degCoefficient.length;
       int len = Math.min(plen1, plen2);
       
       int i;
       for (i = 0; i < len; i++) {
           ans.setCoefficient(i, this.degCoefficient[i] + p.degCoefficient[i]);
       }
       while(i < plen1){
           ans.setCoefficient(i, this.degCoefficient[i]);
           i++;
       }

       while(i < plen2){
           ans.setCoefficient(i, p.degCoefficient[i]);
           i++;
       }
       return ans;
   }

   public Polynomial subtract(Polynomial p){
       int plen1 = this.degCoefficient.length;
       int plen2 = p.degCoefficient.length;
       int length = Math.min(plen1, plen2);
       Polynomial ans = new Polynomial();

       int i;
       for (i = 0; i < length; i++) {
            ans.setCoefficient(i, this.degCoefficient[i] - p.degCoefficient[i]);
       }

       while(i < plen1){
           ans.setCoefficient(i,this.degCoefficient[i]);
           i++;
       }

       while(i < plen2){
           ans.setCoefficient(i, -p.degCoefficient[i]);
           i++;
       }
       return ans;
   }

   public int getCoefficient(int degree){
       if(degree < this.degCoefficient.length){
           return degCoefficient[degree];
       }else{
           return 0;
       }
   }

   public Polynomial multiply(Polynomial p1){
       Polynomial ans = new Polynomial();
       for (int i = 0; i < this.degCoefficient.length; i++) {
           for (int j = 0; j < p1.degCoefficient.length; j++) {
                int termDeg = i + j;
                int termCoff = this.degCoefficient[i] * p1.degCoefficient[i];
                int oldCoff = ans.getCoefficient(termDeg);
                ans.setCoefficient(termDeg, termCoff + oldCoff);
           }
       }
       return ans;
   }
}