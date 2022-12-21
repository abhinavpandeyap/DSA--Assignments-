package Q6;

import java.util.Stack;

public class InfixToPrefix {
	public static String convert(String infix) {
	    String reversedInfix = new StringBuilder(infix).reverse().toString();
	    reversedInfix = "(" + reversedInfix + ")";
	    String postfix = InfixToPostfix.convert(reversedInfix);
	    return new StringBuilder(postfix).reverse().toString();
	  }


  private static class InfixToPostfix {
    public static String convert(String infix) {
      StringBuilder postfix = new StringBuilder();
      Stack<Character> stack = new Stack<>();

      for (char c : infix.toCharArray()) {
        if (isOperand(c)) {
          postfix.append(c);
        } else if (isOperator(c)) {
          while (!stack.isEmpty() && isOperator(stack.peek()) && getPrecedence(c) <= getPrecedence(stack.peek())) {
            postfix.append(stack.pop());
          }
          stack.push(c);
        } else if (c == '(') {
          stack.push(c);
        } else if (c == ')') {
          while (stack.peek() != '(') {
            postfix.append(stack.pop());
          }
          stack.pop();
        }
      }

      while (!stack.isEmpty()){
        postfix.append(stack.pop());
      }

      return postfix.toString();
    }

    private static boolean isOperand(char c) {
      return c >= '0' && c <= '9';
    }

    private static boolean isOperator(char c) {
      return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int getPrecedence(char c) {
      if (c == '*' || c == '/') {
        return 2;
      } else if (c == '+' || c == '-') {
        return 1;
      } else {
        return 0;
      }
    }
  }

	public static void main(String[] args) {
		 System.out.println(convert("10+11-12*19/7"));

	}
}
