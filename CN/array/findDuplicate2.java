package CN.array;

public class findDuplicate2 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,8,7,4};
		int duplicateNo = findDuplicate(array);
		System.out.println(duplicateNo);
	}

	private static int findDuplicate(int[] array) {
		// TODO Auto-generated method stub
		int n = array.length;
		int sum = (((n-1) * (n))/2);
		int arraySum = 0;
		for(int i=0;i<array.length;i++) {
			arraySum += array[i];
		}
		return arraySum - sum;
	}
}
