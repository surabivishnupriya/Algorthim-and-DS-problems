import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers:");
		add(Integer.parseInt(is.readLine()), Integer.parseInt(is.readLine()));

		add();

	}

	public static void add(int a, int b) {
		int output = a+b;
		System.out.println("add nums given as args: " +output);
	}

	public static void add() {
		int output = 6+5;
		System.out.println("add without arguments: " +output);
	}

}
