
 public class Tree {
	  
	class Node{
		int value;
		Node left,right;
	
	  public Node(int data) {
		 value=data;
		 left=right=null;
	  }
		  
	  }
	static Node root;
	public Tree() {
		root=null;
	}
	void insert(int data) {

		root=insertRec(root,data);
	}
	Node insertRec(Node root,int data) {
		if(root==null) {
			root =new Node(data);
			return root;
		}

		if(data<root.value) 
			root.left=insertRec(root.left,data);
			else if(data>root.value)
				root.right=insertRec(root.right,data);
		return root;
	}
	void inorder() {
		inorderRec(root);
	}
	static void inorderRec(Node root) {
		
		if(root!=null)
		
		 {
			inorderRec(root.left);
			System.out.println(root.value);
			inorderRec(root.right);
			
		}
	}
	
	static void preorder(Node root) {
		
		
		 if(root!=null) {
			System.out.println(root.value);
			preorder(root.left);
			preorder(root.right);
		}
	}
	static void postOrder(Node root) {
		
		
		 if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.value);
		}
	}
	static int maximumHeight(Node node) {
		if(node==null)
			return 0;
		else {
			int lh=maximumHeight(node.left);
			int rh=maximumHeight(node.right);
			return(Math.max(lh, rh)+1);
		}
		
	}
	static boolean isBalanced(Node node) {
		if(node==null)
			return true;
		int lh=height(node.left);
		int rh=height(node.right);
		if(Math.abs(lh-rh)<=1&&isBalanced(node.left)&&isBalanced(node.right))
			return true;
		
			return false;
	}
	  
	 private static int height(Node node) {
         if(node==null)
		return 0;
         
         return 1 +Math.max(height(node.left),height(node.right));
	}
	 void deleteNode(int data) {
		 root=deleteRec(root,data);
	 }
	 Node deleteRec(Node root,int data) {
		 if(root==null)
		   return root;
				 if(data<root.value)
					 root.left=deleteRec(root.left,data);
				 else if(data>root.value)
					 root.right=deleteRec(root.right,data);
				 else {
					 if(root.left==null)
						 return root.right;
					 else if(root.right==null)
						 return root.left;
					 root.value=minValue(root.right);
					 root.right=deleteRec(root.right,root.value);
				 }
				return root;	 
				 
			 }
		 
		 
	 
	private int minValue(Node root) {
		int min=root.value;
		while(root.left!=null) {
			min=root.left.value;
			root=root.left;
			
		}
		return min;
	}
	public static void main(String[] args) {
		 Tree tr=new Tree();
		 
		 tr=new Tree();
		tr.insert(5);
		 tr.insert(3);
		 tr.insert(4);
		 tr.insert(2);
		 tr.insert(1);
		 tr.insert(6);
		 tr.insert(7);
		 tr.insert(8);
//		 tr.deleteNode(5);
//		 tr.deleteNode(6);
//		 tr.deleteNode(7);
//		 tr.deleteNode(8);
//		 tr.deleteNode(3);
//		 tr.deleteNode(1);
		 tr.deleteNode(4);
		 tr.deleteNode(2);
		System.out.println(root.value);
		
//		if(tr.isBalanced(root))
//			System.out.println("Balanced tree");
//		else
//			System.out.println("Not balanced tree");
//			
		 
		 
		 System.out.println("inorder"); 
		 tr.inorder();
		 System.out.println("Preorder");
		
		 tr.preorder(root);
//		 System.out.println("postorder");
//			
//		 tr.postOrder(root);
		 
	 }

}
