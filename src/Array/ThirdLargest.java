package Array;

public class ThirdLargest {

	public static void main(String[] args) {

		int arr[] = { 2,2,3,1};
		 int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num == first || num == second || num == third) continue; //skips duplicates

	            if (num > first) {
	                third = second;
	                second = first;
	                first = num;
	            } else if (num > second) {
	                third = second;
	                second = num;
	            } else if (num > third) {
	                third = num;
	            }
	        }
	        int res= (third!=Integer.MIN_VALUE)?third:first;   //if array size < 3, return largest
	        System.out.println("Third largest element is : " + res);
	      
		

	}

}
