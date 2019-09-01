public class Queue<T> {
	public class Node<T> {
		T item;
		Node<T> prev;
			Node<T> next;

		public Node(T item, Node<T> next) {
			this.item = item;
			this.next = next;
			this.prev = null;
		}
	}

	Node<T> start = null;
	Node<T> end = null;

	void add(T item) {
		Node<T> newStart = new Node<T>(item, start);
		start = newStart;

		if(newStart.next == null) {
			end = newStart;
		} 
		else {
			newStart.next.prev = newStart;
		}
	}

	T remove() {
		T removedItem = end.item;
		end = end.prev;
		end.next = null;
		return removedItem;
	}

	void printQueue() {
		Node head = start;
		while(head != null) {
			System.out.println(head.item);
			head = head.next;
		}
	}

	public static void main(String [] args) {
		Queue<Integer> queue =  new Queue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.remove();
		queue.add(7);
		queue.add(8);
		queue.remove();
		queue.remove();
		queue.printQueue();
	}
}