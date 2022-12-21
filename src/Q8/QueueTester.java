package Q8;

public class QueueTester {

	public static void main(String[] args) {
	   Queue q=new Queue(10);
	   q.enqueue(10);
	   q.enqueue(13);
	   q.enqueue(14);
	   q.enqueue(102);
	   q.enqueue(98);
	   q.display();
	   q.dequeue();
	   q.dequeue();
	   q.dequeue();
	   q.dequeue();
	   q.display();

	}

}
