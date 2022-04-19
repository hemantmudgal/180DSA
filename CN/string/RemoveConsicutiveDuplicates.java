package CN.string;

import java.util.Scanner;

public class RemoveConsicutiveDuplicates {
    public static String removeConsecutiveDuplicates(String input) {
        String dummyString = "";
        dummyString = dummyString + input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                continue;
            }
            dummyString = dummyString + input.charAt(i);
        }
        return dummyString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeConsecutiveDuplicates(str));
    }

}