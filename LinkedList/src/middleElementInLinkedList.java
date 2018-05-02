import java.util.LinkedList;

public class middleElementInLinkedList {
	public static void main(String[] args) {
		LinkedList LL=new LinkedList();
		LL.add(1);
		LL.addFirst(2);
		LL.add(5);
		//LL.remove();
		//LL.remove(1);
		System.out.println(LL);
		int temp=LL.size();
		System.out.println(temp/2);
		System.out.println(LL.get(LL.size()/2));
	}

}
