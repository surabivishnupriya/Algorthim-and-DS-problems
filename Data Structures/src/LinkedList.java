public class LinkedList {
	int size = 0;
	Node startNode = null;
	Node latestNode = null;

	void display() {
		if (size == 0) {
			System.out.println("Empty linked list!!");
			return;
		}

		System.out.println( startNode.getData());
		Node printNode = startNode;
		int nthElement = 1;
		while (printNode.link != null) {
			System.out.println(++nthElement + " element: " + printNode.link.data);
			printNode = printNode.link;
		}
	}

	void insert(int data) {
		if (size == 0) {
			startNode = new Node(data, null);
			latestNode = startNode;
			size++;
		} else {
			Node newNode = new Node(data, null);
			latestNode.setLink(newNode);
			latestNode = newNode;
			size++;
		}
	}

	void delete() {

	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.display();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		linkedList.insert(5);
		linkedList.insert(6);
		linkedList.insert(7);
		linkedList.display();
	}

	public class Node {
		int data;
		Node link;

		public Node(int data, Node link) {
			this.data = data;
			this.link = link;
		}

		int getData() {
			return data;
		}

		Node getLink() {
			return link;
		}

		void setLink(Node link) {
			this.link = link;
		}
	}
}
