// Given an array of n integers where n > 1, nums, return an array output such that
// output[i] is equal to the product of all the elements of nums except nums[i].
//
// Solve it without division and in O(n).
//
// For example, given [1, 2, 3, 4], return [24, 12, 8, 6].
//
// FOLLOW UP
// Could you solve it with constant space complexity? 
// (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

// Idea: iterate through the input array twice
// 		 first: iterate toward the right, store products left of current num in output array
// 		 second: iterate toward left, multiply stored left product by right product
public class ProductExceptSelf {
	private int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return new int[]{};
        int[] result = new int[len];
        result[0] = 1;
        for(int i = 1; i < len; ++i) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for(int i = len - 1; i > -1; --i) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return result;
    }
}