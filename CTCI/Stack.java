public class Stack {
	public class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	Node top = null;

	void push(int value) {
		Node newTop = new Node(value, top);
		top = newTop;
	}

	int pop() {
		int poppedValue = top.value;
		top = top.next;
		return poppedValue;
	}

	int peek() {
		return top.value;
	}

	void showStack() {
		Node head = top;
		while(head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}

	public static void main(String [] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(3);
		stack.push(4);
		stack.push(7);
		stack.pop();
		stack.pop();

		stack.showStack();
	}
}