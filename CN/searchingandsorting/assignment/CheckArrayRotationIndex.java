package CN.searchingandsorting.assignment;

public class CheckArrayRotationIndex {

	public static int checkIndex(int[] array) {
		int minIndex = 0;
		int min = array[0];
		for(int i=0;i<array.length;i++) {
			if(min > array[i]) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	
	public static void main(String[] args) {
		int[] array = {15, 18, 2, 3, 6, 12};
		int value = checkIndex(array);
		System.out.println(value);
	}
}
