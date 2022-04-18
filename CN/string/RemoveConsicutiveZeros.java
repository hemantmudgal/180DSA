package CN.string;

import java.util.Scanner;

public class RemoveConsicutiveZeros {
	 public static String removeConsecutiveDuplicates(String input){
		 String dummyString = "";
		 dummyString = dummyString  + input.charAt(0);
		 int temp = 0;
		 for(int i=0;i<input.length();i++) {
			 if(dummyString.charAt(temp) == input.charAt(i)) {
				 continue;
			 }
			 dummyString = dummyString + input.charAt(i);
			 temp++;
		 }
		 
		 return dummyString;
		 
	    }
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(removeConsecutiveDuplicates(str));;
	}

}
