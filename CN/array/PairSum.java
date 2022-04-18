package CN.array;

public class PairSum {
	public static void main(String[] args) {
		int[] arr = {1,3,6,2,5,4,3,2,4};
		int x = 7;
		pairSum(arr,x);
	}

	private static void pairSum(int[] arr, int x) {

		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == x) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		
	}

}
