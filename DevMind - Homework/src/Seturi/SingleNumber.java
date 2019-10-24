package Seturi;

import java.util.HashSet;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int result = 0;
		HashSet<Integer> set = new HashSet<>(50, 0.5f);
		int sumMin = 0, sumMax = 0;
		for(int i=0; i<nums.length; i++) {
			if(set.contains(nums[i])) {
				sumMin += nums[i];
			}else {
				set.add(nums[i]);
				sumMax += nums[i];
			}
		}
		result = sumMax - sumMin;
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 2, 1, 1, 5};
		System.out.println(singleNumber(nums));
	}
}
