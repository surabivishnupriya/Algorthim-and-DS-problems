
public class SingleLinkedList {
	Node head;

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);

	}

	public void prepend(int data) {
		Node newhead = new Node(data);
		newhead.next = head;
		head = newhead;
	}

	public void insertAfter(int data, int position) {
		int count = 1;
		if (head == null) {
			return;
		}
		if (position <= 0) {
			System.out.println("enter correct position");
		}
		Node current = head;
		while (current != null) {

			if (count == position) {
				Node newnode = current.next;
				current.next = new Node(data);
				current.next.next = newnode;
			}
			count++;
			current = current.next;

		}
		if (count <= position)
			System.out.println("can't be inserted");
	}

	public void display() {
		if (head == null) {
			System.out.println("empty single linked list");
		}

		Node current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}

	public void delete() {
		if (head == null)
			return;

		if (head.next == null) {
			System.out.println("deleted one element");
			head = null;
		} else {

			Node current = head;
			Node previous;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = current.next.next;
		}

	}

	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		// sll.append(2);
		// sll.delete();
		// sll.display();
		sll.append(3);
		 sll.prepend(4);
		//
		sll.append(20);
		// sll.delete();
		// sll.display();
		// sll.delete();
		// sll.delete();
		sll.insertAfter(7, 1);
		sll.insertAfter(18, 2);
		sll.display();
		sll.swap();
		 sll.display();
	}

	private void swap() {
		Node current = head;
		Node prev = current;
		current = current.next;
		head = current;

		while (current != null) {
			Node next = current.next;
			current.next = prev;
			if(next==null||next.next==null) {
				prev.next=next;
				break;
			}

			prev.next = next.next;
			prev = next;
			current = prev.next;

		}

	}

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;

		}

	}

}
