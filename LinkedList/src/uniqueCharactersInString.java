
public class uniqueCharactersInString {
	
	public static void main(String[] args) {
		String input="vidgsi";
	
		if(givenStringUnique(input))
			System.out.println("given string has unique characters");
		else
			System.out.println("given string doesn't have unique characters");
	}

	public static  boolean givenStringUnique(String st) {
		int checker=0;
		for(int i=0;i<st.length();i++){
			int index=st.charAt(i)-'a';
			System.out.println(index);
			System.out.println(checker);
			System.out.println( 1<<index);
			
			
			System.out.println(checker & 1<<index);
			if((checker & (1<<index))>0)
				return false;
			checker=checker|1<<index;
			System.out.println(i+" at "+ checker);
			
		}
		return true;
	}

}
