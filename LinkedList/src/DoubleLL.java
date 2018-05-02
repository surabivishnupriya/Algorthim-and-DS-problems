
public class DoubleLL {

	static Node head;

	public static void insert(int data) {
		Node newnode = new Node(data);
		if (head == null) {

			head = newnode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newnode;

	}
	public static void display()
	{
		if (head == null)
		{
			System.out.println("List is empty");
		}
		Node current = head;
		while (current != null)
		{
			System.out.print(current.data);
			current = current.next;
		}
		
		
	}

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
		public static void main(String args[])
		{
			//insert(4);
			display();
			
		}

	

}
