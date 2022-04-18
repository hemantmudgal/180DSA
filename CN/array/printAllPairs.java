package CN.array;

public class printAllPairs {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		printAllPair(array);
	}

	private static void printAllPair(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				System.out.println("( "  + array[i] + ", " +  array[j] + ")");
			}
		}
	}

}
