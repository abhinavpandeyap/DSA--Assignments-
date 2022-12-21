package Q1;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack s=new Stack();
      s.push(15);
      s.push(1);
      s.push(18);
      s.push(25);
      s.display();
      s.pop();
      s.display();
      s.peek();
      System.out.println(s.isEmpty());
      System.out.println(s.isFull());
      s.pop();
      s.pop();
      s.pop();
      System.out.println(s.isEmpty());
	}

}
