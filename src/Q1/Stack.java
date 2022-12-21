package Q1;

public class Stack<T> {
	//data members
	private int top;
	private int size;
	private T[] arr;
	//default constructors
	public Stack() {
		System.out.println("stack is  created");
		this.top =-1;
		this.arr=(T[]) new Object[10] ;
	}
	//parameterized constructors
	public Stack(int size) {
		System.out.println("stack is  created");
		this.top=-1;
		this.arr=(T[]) new Object[size];
	}
   //functions
public boolean push(T data) {
		if(!isFull()) {
			this.top=top+1;
			arr[top]=data;
			return true;
		}
		return false;
		
	}
	
public boolean pop() {
	if(!isEmpty()) {
		top=top-1;
		return true;
	}
	return false;
		
	}

public void peek() {
	if(!isEmpty()) {
		System.out.println(arr[top]);
	}
	else
		System.out.println("Stack is Empty");
	
}

public boolean isFull() {
	
	return (top>=arr.length-1);
	
}

public boolean isEmpty() {
	return top==-1;
	
}

public void display() {
	for(int i=top;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	
	

}
