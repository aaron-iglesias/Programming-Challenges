// Reverse digits of an integer.
// Example 1: x = 123, return 321
// Example 2: x = -123, return -321

public class Reverse {
	public int reverse(int x) {
		int result = 0;
		while(x != 0) {
			// get least signficant digit of x
			int d = x % 10;
			// append to result
			int newResult = result * 10 + d;
			// check overflow by reverse operation
			// if overflow, return 0
			if((newResult - d) / 10) != result)
				return 0;
			// update result
			result = newResult;
			// shift x to the right
			x = x / 10;
		}
		return result;
	}
}