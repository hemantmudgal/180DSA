package CN.string;

import java.util.Scanner;

public class RemoveCharacter {

	 public static String removeAllOccurrencesOfChar(String input, char c) {
		 String ans = "";
		 for(int i=0;i<input.length();i++) {
			 if(input.charAt(i) == c)
				 continue;
		 	ans = ans + input.charAt(i);
		 }
		 
		 return ans;
		 
	 }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.next();
	        char c = sc.next().charAt(0);
	        String ans = removeAllOccurrencesOfChar(input, c);
	        System.out.println(ans);
	    }
}
