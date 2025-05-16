package Array;

public class MinMax {

	public static void main(String[] args) {

		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * i;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Min and Max values in the array are : " + min + " and " + max);

	}

}
