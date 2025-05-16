package Array;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		Arrays.sort(nums);
		System.out.println(hasDuplicate(nums));
	}

	private static boolean hasDuplicate(int[] nums) {
		int num = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == num) {
				return true;
			} else {
				num = nums[i];
			}
		}
		return false;
	}
}
