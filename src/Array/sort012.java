package Array;

import java.util.ArrayList;
import java.util.Collections;

public class sort012 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(0);
		//better(arr);
		optimal(arr); //Duetch national flag algo

}
	private static void optimal(ArrayList<Integer> arr) {
		int low = 0, mid=0 , high = arr.size()-1;
		
		while(mid<=high) {
			
			if(arr.get(mid)==0) {
				Collections.swap(arr,mid,low);
				low++;
				mid++;
				
			}
			
			if(arr.get(mid)==1) {
				mid++;
			}
			
			if(arr.get(mid)==2) {
				Collections.swap(arr,mid,high);
				high--;
			}
		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	
	
	
	private static void better(ArrayList<Integer> arr) {
		ArrayList<Integer> arr1 = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i) == 0) {
				arr1.add(0);
			}
		}

		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i) == 1) {
				arr1.add(1);
			}
		}

		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i) == 2) {
				arr1.add(2);
			}
		}

		for (int i : arr1) {
			System.out.print(i + " ");
		}

	}	
	}