package com.neml;

import java.util.Stack;

public class Paranthesis {

	public static void main(String[] args) {

		String s = "[({})]";
		boolean result = getFormat(s);
		System.out.println(result);
	}

	static boolean getFormat(String s) {

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();

				if (!((top == '(' && ch == ')') || (top == '[' && ch == ']') || (top == '{' && ch == '}'))) {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}
}
