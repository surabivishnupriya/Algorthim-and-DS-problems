
public class TwoArrays {
	public static void main(String[] args) {
		int a[] = { 2, 5 ,7};
		int sum = 0;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == sum / 2) {
				System.out.println("array can be split into 2 arrays at"+a[i]);
				break;
			} 
			count++;
		}
		if (count>a.length-1)
		System.out.println("array can't be splitted into 2");
	}

}
