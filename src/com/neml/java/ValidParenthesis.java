package com.neml.java;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {

		String s = "{[(";
		boolean result = GetValidParenthesis.isValid(s);
		System.out.println(result);

	}

}

class GetValidParenthesis {
	public static boolean isValid(String s) {

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {    //()[]{}
                st.push(c); //{[(
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop(); //(
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
		return st.isEmpty();
	}
}