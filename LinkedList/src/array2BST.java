
public class array2BST {
	
	static class Node {
		int value;
		Node left;
		Node right;
		public Node(int data) {
			value=data;
			left=right=null;
			
		}
	}
		static Node root;
		
		public static void main (String[] args){
			int[] a= {2,5,7,8,9};
			int start=0;
			int end=a.length-1;
			array2BST ab=new array2BST();
			root=ab.convert(a,start,end);
			System.out.println("Inorder");
			ab.inorder();
			
		}
		
	

	private void inorder() {
			inorderRec(root);
			
		}



	public static void inorderRec(Node root) {
		if(root!=null) {
		
		System.out.println(root.value);
			inorderRec(root.left);
			inorderRec(root.right);
			
		
		}
	}



	public Node convert(int[] a, int start, int end) {
		
		if(start>end)
			return null;
		int mid=(start+end)/2;
	    Node node=new Node(a[mid]);
		node.left=convert(a,start,mid-1);
		node.right=convert(a,mid+1,end);
	
		return node;
	
  
}
}
