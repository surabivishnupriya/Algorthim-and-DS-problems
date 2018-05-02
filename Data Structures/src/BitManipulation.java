import java.util.function.BinaryOperator;

public class BitManipulation {
	public static void main(String[] args) {
		int m=7;
		int n=20;
		String s1=Integer.toBinaryString(m);
		String s2=Integer.toBinaryString(n);
		
		int s=Math.max(s2.length(),s1.length());
		char[] result=new char[s];
	for (int i=s;i>0;i--) {
		if(s1.length()%s==0)
			result[i]=s1.charAt(i);
		
			result[i]=s2.charAt(i);
		
	}
	    System.out.println(result);
	}

}
	