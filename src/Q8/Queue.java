package Q8;

public class Queue {
	private int front,rear,size;
	private int[] arr;
	public Queue() {
		this.front=-1;
		this.rear=-1;
		this.size=10;
		this.arr=new int[size];
	}
	public Queue(int s) {
		this.front=-1;
		this.rear=-1;
		this.size=s;
		this.arr=new int[size];
	}
	
	public boolean enqueue(int data) {
		if(!isFull()) {
			rear=rear+1;
			arr[rear]=data;
			if(front==-1)
				front=0;
		}
		return false;
	}
	public boolean isFull() {
	
		return rear>=size-1;
	}
	public boolean dequeue() {
		if(!isEmpty()) {
		front=front+1;	
		}
		return false;
	}
	public boolean isEmpty() {
		return front>=rear;
	}
    public void display() {
    	for(int i=front;i<=rear;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
}
