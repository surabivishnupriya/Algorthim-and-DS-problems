import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack {
	private int top;
	private int item[];
	

	Stack(int size) {
		top = -1;
		item = new int[size];
	}

	void pushItem(int data) {
		if (top == item.length - 1)
			System.out.println("Stack is full");
		else {
			item[++top] = data;
			System.out.println("pushed item" + item[top]);
		}
	}

	int popItem() {
		if (top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			System.out.println("pop item:" + item[top]);
			return item[top--];
		}

	}

}

class StackExample{
	public static void main(String[] args) throws  IOException {
		Stack stc=new Stack(5);
		boolean yes=true;
		int choice;
		BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("1.push 2.pop 3.Exit /n Enter Choice ");
			choice=Integer.parseInt(is.readLine());
			
			switch(choice)
			{
			case 1:System.out.println("Enter push item:");
					stc.pushItem(Integer.parseInt(is.readLine()));
					break;
			case 2:stc.popItem();break;
			case 3:yes =false;break;
			default:System.out.println("Invalid choice");
			}
		}while(yes==true);
		
		
	}
}
