// Given a set of distinct integers, nums, return all possible subsets.
// Note: The solution set must not contain duplicate subsets.

import java.util.ArrayList;

public class GetAllSubsets {
	// iterative solution
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
		ArrayList<Integer> emptySet = new ArrayList<>();
		result.add(emptySet);
		for(int i = 0; i < nums.length; ++i) {
			int n = nums[i];
			int len = result.size();
			for(int j = 0; j < len; ++j) {
				ArrayList<Integer> newSet = new ArrayList<>(result.get(j));
				newSet.add(n);
				result.add(newSet);
			}
		}
		return result;
    }
}