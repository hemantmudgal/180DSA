/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 19-04-2022
 *   Time: 17:54
 *   File: CountWords.java
 */

package CN.string;

public class CountWords     {

    public static int countNumberOfWords(String str){

        if (str.length() == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        String str = "This is the sample string";
        int result = countNumberOfWords(str);
        System.out.println(result);
    }
}