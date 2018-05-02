import java.util.Stack;

public class EvaluatePostfixExpression {
	public static void main(String[] args) {
		String s="456*+";
		char ch[]=new char[s.length()];
		ch=s.toCharArray();
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='+'||s.charAt(i)=='-') {
				int t1=st.pop();
				int t2=st.pop();
				if(s.charAt(i)=='*')
			    st.push((t1*t2));
				else if(s.charAt(i)=='+')
					st.push(t1+t2);
				else if(s.charAt(i)=='-')
					st.push(t2-t1);
				else if(s.charAt(i)=='/') 
					st.push(t2/t1);
				
					
				}
			else {
				int a=Integer.parseInt(String.valueOf(ch[i]));
			st.push(Character.getNumericValue(s.charAt(i)));
			System.out.println(a);
			}
			
		}
			System.out.println(st);
		}
		
}


