public class Insertion {
	int size = 0;
	Node startnode;
	Node currentNode;
	Node previousNode;

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
		void setData(int data){
			this.data=data;
		}
		void setLink(Node link) {
			this.link=link;
		}
		
		

	}

	void push(int data) {
		if (size == 0) {
		   startnode = new Node(data, null);
			size++;
			currentNode=startnode;
			//System.out.println(size);
			//System.out.println(startnode.getData());
			return;
			
		}
		else {
			Node newNode=new Node(data,null);
			currentNode.setLink(newNode);
			previousNode=currentNode;
			currentNode=newNode;
			size++;
			
			
		}
	}

	public void display() {
		if(size==0) {
		
			System.out.println("no elements ");
			return;
		}
		
			System.out.println("First Element:"+startnode.getData());
		Node head;
		head=startnode;
		int count=1;
		while(head.link!=null) {
			
			
		
		System.out.println(++count+"." +head.link.getData());
		 head=head.link;
		}
		
	}
	public void delet() {
		
		previousNode.setLink(null);
	
		size--;
	}

	public static void main(String[] args) {
		Insertion I = new Insertion();
		I.display();
		I.push(1);
		//I.display();
		I.push(4);
		//I.display();
		I.push(4);
		//I.display();
		I.push(10);
		//I.display();
		I.delet();
		I.display();
	}

}
