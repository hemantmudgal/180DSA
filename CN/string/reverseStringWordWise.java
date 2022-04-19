package CN.string;

import java.util.Scanner;

public class reverseStringWordWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseStringWordWise(str);
        System.out.println(ans);
    }
    public static String reverseStringWordWise(String str) {
        String newString = "";
        String ans = "";
        int i = 0;
        int currentWordStart = 0;
        for (; i < str.length(); i++) {
            newString = str.charAt(i) + newString;
        }

        for (i = 0; i < newString.length(); i++) {
            String reverseString = "";
            if(newString.charAt(i) == ' '){
                int currentWordEnd = i - 1;
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reverseString = newString.charAt(j) + reverseString;
                }
                ans += reverseString + " ";
                currentWordStart = i + 1;
            }
        }

        String reverseString = "";
        int currentWordEnd = i - 1;
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reverseString = newString.charAt(j) + reverseString;
        }
        ans += reverseString + " ";

        return ans;
    }
}
