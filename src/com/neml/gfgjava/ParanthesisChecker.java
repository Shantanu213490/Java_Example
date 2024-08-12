package com.neml.gfgjava;

import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {

		String x = "([";
		boolean result = CheckParan.ispar(x);
		System.out.println(result);

	}

}

class CheckParan {
	public static boolean ispar(String x) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < x.length(); i++) {

			char c = x.charAt(i);
			if (c == '{' || c == '[' || c == '(') {
				st.push(c);
			} else {
				if (st.isEmpty()) {
					return false;
				}
				char top = st.pop();
				if ((c == ']' && top != '[') || (c == '}' && top != '{') || (c == ')' && top != '(')) {
					return false;
				}
			}
		}
		return st.isEmpty();
	}
}