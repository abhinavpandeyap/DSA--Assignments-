package Q2;

import java.util.Scanner;

import Q2.Stack;


public class ReverseString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Stack<String> stack=new Stack<String>(s.length()) ;
	for(int i=0;i<s.length()-1;i++) {
		stack.push(s.charAt(i));
	}
	stack.display();

	}

}
