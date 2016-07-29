// Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can
// only move in two directions: right and down. How many possible paths are there for
// the robot?

import java.util.HashMap;
import java.util.ArrayList;

public class RobotPaths {
	// memoize results to drastically reduce runtime
	// O(2^n) otherwise
	private static HashMap<ArrayList<Integer>, Long> map = new HashMap<ArrayList<Integer>, Long>();
	public static void main(String[] args) {
		System.out.println(possiblePaths(25, 20, 30));
	}

	// Original question
	// (r, c) are the coordinates in n x n grid
	private static long possiblePaths(int r, int c, int n) {
		ArrayList<Integer> pair = new ArrayList<Integer>();
		pair.add(r);
		pair.add(c);
		if(map.containsKey(pair))
			return map.get(pair);
		if(r < 0 || c < 0 || r >= n || c >= n)
			return 0;
		if(r == 0 || c == 0)
			return 1;
		long result = possiblePaths(r - 1, c, n) + possiblePaths(r, c - 1, n);
		map.put(pair, result);
		return result;
	}
}