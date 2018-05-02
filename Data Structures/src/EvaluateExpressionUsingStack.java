import java.util.Stack;

public class EvaluateExpressionUsingStack{
	public static void main(String[] args) {
		String expression = "2+9*5";
		Stack<Character> st = new Stack<Character>();
		int n = expression.length();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println(expression.charAt(i));
			//int result = Integer.parseInt(expression, expression.charAt(i));
			//System.out.println(result);
			if (expression.charAt(i) == '*') {
				st.push((char) (st.pop() * expression.charAt(i)));
				i = i + 1;
			}
			if (expression.charAt(i) != '+' && expression.charAt(i) != '*')
				st.push(expression.charAt(i));
			// System.out.println(st);
			else 
				i++;
		}
		System.out.println(st);
		while (st.size() > 0) {

			sum = sum + st.pop();

		}
		System.out.println(sum);
	}

}
