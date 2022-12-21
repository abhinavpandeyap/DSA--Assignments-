package Q3;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Stack<Integer> stack=new Stack<Integer>();
		while(num>0) {
			stack.push(num%2);
			num=num/2;
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

}
