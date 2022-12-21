package Q4;

class Dstack {
	private int[] arr;
	private int top1, top2, size;

	public Dstack(int size) {
		this.size = size;
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}

	// Inserts an element at the front of the stack
	public boolean pushTop1(int data) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = data;
			return true;
		} else
			return false;
	}

	// Inserts an element at the back of the stack
	public boolean pushTop2(int data) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = data;
			return true;
		} else
			return false;
	}

	// Removes an element from the front of the stack
	public int popTop1() {
		if (top1 >= 0) {
			int data = arr[top1];
			top1--;
			return data;
		} else {
			System.out.println("Stack underflow");
			return -1;
		}
	}

	// Removes an element from the back of the stack
	public int popTop2() {
		if (top2 < size) {
			int data = arr[top2];
			top2++;
			return data;
		} else {
			System.out.println("Stack underflow");
			return -1;
		}
	}
	
	public void display() {
		  System.out.print("Elements in the stack: ");
		  for (int i = top1; i >= 0; i--) {
		    System.out.print(arr[i] + " ");
		  }
		  for (int i = top2; i < size; i++) {
		    System.out.print(arr[i] + " ");
		  }
		  System.out.println();
		}
}
