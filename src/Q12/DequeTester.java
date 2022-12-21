package Q12;

public class DequeTester {

	public static void main(String[] args) {
	  Deque dq=new Deque(10);
	  dq.insertFront(15);
	  dq.insertFront(20);
	  dq.insertFront(23);
	  dq.insertFront(25);
	  dq.display();
	  dq.insertRear(13);
	  dq.insertRear(14);
	  dq.insertRear(12);
	  dq.insertRear(108);
	  dq.display();
	  dq.removeFront();
	  dq.removeRear();
	  dq.display();

	}

}
