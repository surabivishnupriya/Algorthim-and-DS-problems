import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  class  Stack1{
	private int top;
	private String item[];

	Stack1(int size) {
		top = -1;
		item = new String[size];
	}

	void pushItem(String data) {
		if (top == item.length - 1)
			System.out.println("Stack is full");
		else {
			item[++top] = data;
			System.out.println("pushed item" + item[top]);
		}
	}

	String popItem() {
		if (top < 0) {
			System.out.println("stack underflow");
			return null;
		} else {
			System.out.println("pop item:" + item[top]);
			return item[top--];
		}

	}

	public void peekItem() {
		if(top<0)
			System.out.println("No top element in stack");
		else
			System.out.println("peek item:"+item[top]);
		
	}

}
public class StackUsingArrays {
	public static void main(String[] args) throws  IOException {
		Stack1 stc = new Stack1(5);
		boolean yes = true;
		int choice;
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("1).Push\n2).Pop\n3).Exit\n4).peek\n\nEnter Choice");
			choice = Integer.parseInt(is.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter push item: ");
				stc.pushItem(is.readLine());
				break;
			case 2:
				stc.popItem();
				break;
			case 3:
				yes = false;
				break;
			case 4:	stc.peekItem();
					break;
			default:
				System.out.println("Invalid choice");
			}
		} while (yes == true);
		System.out.println();
	}

}
