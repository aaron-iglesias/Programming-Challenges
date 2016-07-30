// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution.

import java.util.HashMap

public class TwoSum {
	private int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; ++i) {
			int diff = target - nums[i];
			if(map.containsKey(diff))
				return new int[]{i, map.get(diff)};
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No solution.");
	}
}