// How would you design a stack which, in addition to push and pop, also has a function
// min which returns the minimum element? Push, pop, and min should all operate in
// O(1) time.

import java.util.Stack;

// Idea: Use two stacks: minStack and stack
// 		 nth element of minStack is the min element in [1, 2, ..., n] of stack
//		 getMin() returns top element in minStack
public class MinStack {
	// keeps track of mins
	private Stack<Integer> minStack;
	// keeps track of elements
	private Stack<Integer> stack;

	private MinStack() {
		minStack = new Stack<Integer>();
		stack = new Stack<Integer>();
	}

	private void push(int n) {
		if(minStack.empty() || n < minStack.peek()) 
			minStack.push(n);
		else
			minStack.push(minStack.peek());
		stack.push(n);
	}

	private int pop() {
		minStack.pop();
		return stack.pop();
	}

	private int getMin() {
		if(minStack.empty())
			return Integer.MAX_VALUE;
		return minStack.peek();
	}

}