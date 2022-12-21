package Q5;

import java.util.Stack;
//To convert an infix expression to its postfix form, you can use a stack to store operators and apply the following steps:
//
//Initialize an empty stack.
//Iterate through the characters of the infix expression.
//If the character is an operand, append it to the postfix expression.
//If the character is an operator, push it onto the stack.
//If the character is a left parenthesis, push it onto the stack.
//If the character is a right parenthesis, pop operators from the stack and append them to the postfix expression until you encounter a left parenthesis. Discard the left and right parentheses.
//Repeat the above steps until you reach the end of the infix expression.
//Pop any remaining operators from the stack and append them to the postfix expression

public class InfixToPostfix {
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

    while (!stack.isEmpty()) {
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
  
  public static void main(String[] args) {
	  System.out.println(convert("((10+11)-((12*19)/7))"));
	  
	  
	  
	  
  }
}

