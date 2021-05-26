package com.learning.data_structures_algorithms_java.stack;

public class BracketChecker {

	private void check(String input) {

		int stackSize = input.length();
		Stack<Character> stack = new Stack<Character>(stackSize);

		for (int i = 0; i < stackSize; i++) {

			Character ch = input.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':
				stack.push(ch);
				break;
			case '}':
				checkBracketsCorrectlyClosed(stack, i, ch,'{');
				break;
			case ']':
				checkBracketsCorrectlyClosed(stack, i, ch,'[');
				break;
			case ')':
				checkBracketsCorrectlyClosed(stack, i, ch,'(');
				break;
			default:
				break;
			}
		}

		if (!stack.isEmpty()) {
			System.out.println("Error missing right delimiter");
		}
	}

	private void checkBracketsCorrectlyClosed(Stack<Character> stack, int i, Character ch, char openBracket) {
		if (!stack.isEmpty()) {
			Character pop = stack.pop();
			if (pop != openBracket) {
				System.out.println("Error: " + ch + " at " + i);
				System.exit(1);
			}

		} else {
			System.out.println("Error: " + ch + " at " + i);
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		BracketChecker checker = new BracketChecker();
		checker.check("{,}{(()}[)]");
	}
}
