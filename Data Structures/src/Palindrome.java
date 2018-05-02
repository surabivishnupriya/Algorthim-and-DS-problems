import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s,r = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		s = sc.nextLine();
		for (int i = s.length() - 1; i >= 0; i--) {
			r=r+s.charAt(i);
		}
		if (s.equals(r))
			System.out.println("given string is palindrome");
		else
			System.out.println("not");
	}

}
