import java.util.Stack;

public class ReverseTheStack {
	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		int temp;
		s1.push(3);
		s1.push(4);
		s1.push(8);
		s1.push(0);
		s1.push(7);
		s1.push(20);
		int n=s1.size();
		System.out.println(s1);
		
		for(int i=0;i<n;i++) {
			temp=s1.pop();
		while(s1.size()>i) {
			s2.push(s1.pop());
			//System.out.println("at:"+i+s2);
		}
			
		s1.push(temp);
		while(s2.size()>0) {
			
			s1.push(s2.pop());
		}
		}
		System.out.println(s1);
		//System.out.println(s1.subList(1, 4));

		
	}
	
}
