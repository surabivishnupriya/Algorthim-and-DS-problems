import java.util.Stack;

public class MissingParenthisisUsingStack {
	public static void main(String[] args) {
		String s="– 2 * ( (3 + 5(sasdfasdfasd))))";
		//char[] ch=s.toCharArray();
		
		Stack<Character>st=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				st.push(s.charAt(i));
			else if(s.charAt(i)==')')
				if(st.isEmpty()) {
					System.out.println("open parenthisis is missing");
					System.exit(0);
				}
				else
				st.pop();
		}
		if(st.isEmpty()) {
			System.out.println("No missing parenthisis");
			
		}
		else if(st.size()>0)
			System.out.println("close parenthisis is missing");
		
		
		
		
	}

}
