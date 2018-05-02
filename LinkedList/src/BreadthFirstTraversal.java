

import java.util.LinkedList;

import java.util.Queue;


public class BreadthFirstTraversal {
	class Node{
		int value;
		Node left, right;
		 Node(int data) {
			value=data;
			left=right=null;
			
		}
	}
		 Node root=null;
		  void insert(int data) {
			 root=insertRec(root,data);
		 }
		 Node insertRec(Node root, int data) {
			if(root==null) {
				root=new Node(data);
				return root;
			}
			if(data<root.value) {
				root.left=insertRec(root.left,data);
			}
			else if(data>root.value)
			root.right=insertRec(root.right, data);
			return root;
			 
		 }
		 
	public static void main(String[] args) {
	  BreadthFirstTraversal BFT=new BreadthFirstTraversal();
	  BFT.insert(7);
	  BFT.insert(9);
	  BFT.insert(8);
	  BFT.insert(5);
	  BFT.insert(4);
	  BFT.insert(6);
	  BFT.display();
	}
	private void display() {
	Queue<Node> queue=new LinkedList<Node>();
	queue.add(root);
	if(root==null)
		System.out.println("Tree is empty");
	else {
	while(!queue.isEmpty()) {
		int levelNode=queue.size();
		while(levelNode>0) {		
		Node tempNode=queue.remove();
		System.out.print(tempNode.value+" ");
		if(tempNode.left!=null) 
			queue.add(tempNode.left);
		if(tempNode.right!=null)
			queue.add(tempNode.right);
		levelNode--;
	}
		System.out.println("");
	}
	
	}
}
}
