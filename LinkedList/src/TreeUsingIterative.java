import java.util.Stack;

public class TreeUsingIterative {
	class Node{
		int val;
		Node left, right;
	
	public Node(int data) { 
		val=data;
	 left=right=null;
	}
	
	}
	Node root=null;
		public void insertIte(int data) {
			Node current=root;
	if(root==null) {
		//System.out.println("jndcnj");
		root=new Node(data);
		//System.out.println(root.val);
	}
	
		
		else {
		while(current!=null) {
			if(data<current.val) {
				if(current.left!=null)
				current=current.left;
				else {
					current.left=new Node(data);
				break;
				}
			}
			else if(data>current.val) {
				if(current.right!=null)
					current=current.right;
				
				else {
					current.right=new Node(data);
				break;
				}
				
			}
		}
		}
	}
	public static void main(String[] args) {
		TreeUsingIterative TI=new TreeUsingIterative();
		TI.insertIte(5);
		TI.insertIte(6);
		TI.insertIte(3);
		TI.insertIte(1);
		TI.insertIte(30);
		TI.insertIte(25);
//		//System.out.println("inserted");
		TI.inorder();
		System.out.println("Preorder");
		TI.preorder();
		System.out.println("postorder");
		TI.postorder();
		
		
	}
	private void inorder() {
		if(root==null) {
			System.out.println("Tree is empty");
		}
		else {
		Node current=root;
		Stack<Node> st=new Stack<Node>();
		while(!st.isEmpty()||current!=null) {
			if(current!=null) {
				st.push(current);
				current=current.left;
			}
			else {
				Node element = st.pop();
				System.out.println(element.val);
				current=element.right;
			}
			
		}
		}
		
	}
	public void preorder() {
		if(root==null)
			System.out.println("tree is empty");
		else {
		Stack<Node> stackNew=new Stack<Node>();
		stackNew.push(root);
		while(!stackNew.isEmpty()){
			Node newnode=stackNew.pop();
			System.out.println(newnode.val);
			
			if(newnode.right!=null)
				stackNew.push(newnode.right);
			if(newnode.left!=null)
				stackNew.push(newnode.left);
		}
		}
		
	}
	public void postorder() {
		if(root==null)
			System.out.println("tree is empty");
		else {
		Stack<Node> st=new Stack<Node>();
		st.push(root);
	
		while(!st.isEmpty()) {
			Node current=st.peek();
			if(current.left==null &&current.right==null) {
				System.out.println(st.pop().val);	
			}
			else  {
				if(current.right!=null) {
					st.push(current.right);
					current.right=null;
				}
				if(current.left!=null) {
					st.push(current.left);
					current.left=null;
				}
				
			}
				
			}
		}
	}
}
