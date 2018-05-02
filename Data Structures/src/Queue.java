
public class Queue {
	private int index;
	private static String[] item;

	Queue(int size) {
		item = new String[size];
		index = 0;
	}

	public static void main(String[] args) throws Exception {
		Queue q = new Queue(5);

		q.eneque("1");
		q.eneque("4");
		q.eneque("4");
		q.eneque("4");
		q.dequeue();
		q.eneque("5");
		q.eneque("6");
		//q.dequeue();
		q.eneque("5");

		for (String a : item) {
			System.out.println(a);
		}

	}

	private void dequeue() throws Exception {
		if (index == 0) {
			throw new Exception("Queue is empty");
			//System.out.println("Queue is empty");
	

		}
		System.out.println("element deleted is" + item[0]);
		for (int i = 0; i < index-1; i++)
			item[i] = item[i + 1];
		index--;

	}

	void eneque(String value) throws Exception {
		if (this.index > item.length - 1) {
			throw new Exception("queue is full");
		}
		item[index] = value;
		index++;

	}

}
