
public class StringExamples {
	
	public static void main(String[] args) {
		String s="Hello World";
		String s2="java";
		int n=s.length();
		char[] ch= {'j','a','v','a'};
		String s3=new String(ch);
		String s1=new String("Hello World");
		s2=s2.concat("dog");
		System.out.println(s2);
		
		char[] ch1=s.toCharArray();
		System.out.println(" ");
		System.out.println(ch1);
		
		System.out.println("the length of given sting-"+s+" is:"+n);
	}

}
