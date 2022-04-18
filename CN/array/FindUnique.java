package CN.array;

import java.util.Arrays;

public class FindUnique {
  public static void main(String[] args) {
	int[] array = {2,3,1,6,3,6,1,5,2};
	int uniqueNumber = findUniqueValue(array);
	System.out.println(uniqueNumber);
  }
	
	public static int findUniqueValue(int[] array) {
		//First Logic O(n^2)
		 
//		for(int i=0;i<array.length;i++){
//			int j=0;
//			for(j=0;j<array.length;j++) {
//				if(i != j) {
//					if(array[i] ==  array[j]) {
//						break;
//					}
//				}
//			}
//			
//			if(j == array.length) {
//				return array[i];
//			}
//		}
//		
//		return Integer.MAX_VALUE;
//		
//	}
		
		/*
		 * Second Logic O(nlogn)
		 */
		
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		
//		for(int i=0;i<array.length;i+=2) {
//			if(array[i] != array[i+1]) {
//				return array[i];
//			}
//		}
//		
//		return Integer.MAX_VALUE;
//	}	
		
		/*
		 * Third Logic
		 */
		int uniqueValue = 0;
		for(int i=0;i<array.length;i++) {
			uniqueValue = uniqueValue ^ array[i];
		}
		
		return uniqueValue;
	}	
}
