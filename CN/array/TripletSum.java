package CN.array;

public class TripletSum {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int number = 19;
		int numberOfTriplet = Triplet(arr, number);
		System.out.println(numberOfTriplet);
	}

	private static int Triplet(int[] arr,int number) {
		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i] + arr[j] + arr[k] == number) {
						counter++;
					}
				}
			}
		}
		
		return counter;
	}
}
