package Array;

public class FindElement {

	public static void main(String[] args) {
		int arr[] = { 23, 623, 64, 8, 25, 12 };
		int ele = arr[3];
		findele(ele, arr);

	}

	private static void findele(int element, int arr[]) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == element) {
				index = i;
				break;
			}
		}

		System.out.println("The element is found at " + index + " index of the array");
	}

}
