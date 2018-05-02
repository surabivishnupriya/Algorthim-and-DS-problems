
public class ReverseSLL {
	static Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;

		}
	}
		public void insertion(int data) {
			if (head == null) {
				head = new Node(data);
				return ;

			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		

		}

		public void Display() {
			if (head == null) {
				System.out.println("No elements in the list");
				return;
			}
			Node current = head;
			while (current != null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.print('\n');
		}
		public  void rever() {
			if(head==null) {
				System.out.println("No elements to reverse");
				return ;
			}
			
			if(head.next==null) {
				System.out.println(head.data);
				return ;
			}
			Node current=head;
			Node prevnode=null;
			Node nextnode=null;
			while(current!=null) {
				nextnode=current.next;
				current.next=prevnode;
				prevnode=current;
				current=nextnode;
				
			}
			head=prevnode;
			
			
			
		}

		
	public static void main(String[] args) {
		ReverseSLL RSLL=new ReverseSLL();
		RSLL.insertion(3);
		RSLL.insertion(5);
		RSLL.insertion(9);
		RSLL.insertion(19);
		//RSLL.Display(head);
		RSLL.rever();
		RSLL.Display();
		System.out.println("reversal");
		RSLL.rever();
		RSLL.Display();
		
	}

}
