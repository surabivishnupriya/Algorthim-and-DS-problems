
public class Array {
	public static void main(String args[]) {
		int numbers[] = new int[10];
		for(int i=0; i<=9;i++) {
			numbers[i] = i;
		}
		
		for(int i:numbers) {
			System.out.println(i);
		}	
		
	}
	
	public void test() {
		Array a = new Array();
		
		
	}
	
	public class Array2 {
		public String test() {
			int i = 3;

			return String.valueOf(i);
		}
	}
	
}

