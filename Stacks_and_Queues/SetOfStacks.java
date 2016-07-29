// Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore,
// in real life, we would likely start a new stack when the previous stack exceeds some threshold.
// Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several
// stacks, and should create a new stack once the previous one exceeds capacity. SetOfStacks.push()
// and SetOfStacks.pop() should behave identically to a single stack (that is, pop() should return
// the same values as it would if there were just a single stack).
//
// FOLLOW UP
// Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
	private int capacity;
	private ArrayList<Stack<Integer>> stacks;

	public SetOfStacks(int capacity) {
		this.capacity = capacity;
		this.stacks = new ArrayList<>();
	}

	private void push(int n) {
		int size = stacks.size();
		Stack<Integer> currStack = stacks.get(size - 1);
		if(size == 0 || currStack.size() == capacity) {
			Stack<Integer> st = new Stack<>();
			st.push(n);
			stacks.add(st);
		}
		else {
			currStack.push(n);
		}
	}

	private int pop() {
		int size = stacks.size();
		Stack<Integer> currStack = stacks.get(size - 1);
		int n = currStack.pop();
		if(currStack.size() == 0)
			stacks.remove(stacks.size() - 1);
		return n;
	}

	private int peek() {
		int size = stacks.size();
		Stack<Integer> currStack = stacks.get(size - 1);
		int n = currStack.peek();
		return n;
	}

}