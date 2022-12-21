package Q12;

public class Deque {
	  private int[] array;
	  private int front;
	  private int rear;
	  private int size;

	  public Deque(int capacity) {
	    array = new int[capacity];
	    front = 0;
	    rear = capacity - 1;
	    size = 0;
	  }

	  // Insert from front end
	  public void insertFront(int data) {
	    if (isFull()) {
	      System.out.println("Deque is full");
	      return;
	    }
	    front = (front - 1 + array.length) % array.length;
	    array[front] = data;
	    size++;
	  }

	  // Insert from rear end
	  public void insertRear(int data) {
	    if (isFull()) {
	      System.out.println("Deque is full");
	      return;
	    }
	    rear = (rear + 1) % array.length;
	    array[rear] = data;
	    size++;
	  }

	  // Remove from front end
	  public int removeFront() {
	    if (isEmpty()) {
	      System.out.println("Deque is empty");
	      return -1;
	    }
	    int data = array[front];
	    front = (front + 1) % array.length;
	    size--;
	    return data;
	  }

	  // Remove from rear end
	  public int removeRear() {
	    if (isEmpty()) {
	      System.out.println("Deque is empty");
	      return -1;
	    }
	    int data = array[rear];
	    rear = (rear - 1 + array.length) % array.length;
	    size--;
	    return data;
	  }

	  // Check if queue is full
	  public boolean isFull() {
	    return size == array.length;
	  }

	  // Check if queue is empty
	  public boolean isEmpty() {
	    return size == 0;
	  }
	  public void display() {
		  if (isEmpty()) {
		    System.out.println("Deque is empty");
		    return;
		  }
		  for (int i = front; i != rear; i = (i + 1) % array.length) {
		    System.out.print(array[i] + " ");
		  }
		  System.out.println(array[rear]);
		}

	}
