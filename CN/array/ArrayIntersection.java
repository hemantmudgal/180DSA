package CN.array;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] array1 = {2,6,2,3,2};
		int[] array2 = {3,2,2};
		intersectOfArray(array1, array2);
	}

	public static void intersectOfArray(int[] array1, int[] array2) {
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
					array2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
			
	}
}
