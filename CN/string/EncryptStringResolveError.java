package CN.string;

import java.util.Scanner;

public class EncryptStringResolveError {
	 public static String encryptString(String s){
	        // code here
			int[] array = new int[256];
			int temp = 0;
			for(int i=0;i<s.length();i++) {
				temp = (int)(s.charAt(i));
				array[temp]++;
			}
			
			int index =0;
			int value = 0;
			String str = "";
			for(int i=array.length-1;i>=0;i--){
			    if(array[i] != 0){
	                index = i;
	                value = array[i];
	                 str += (value + "" + (char)index);
			    }
			}
			
			return str;
	    }

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String string = encryptString(str);
		System.out.println(string);
	}
}
