import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedTwoarrays {

	public static void main(String[] args)  {

		int a[] = { 1,3,5,7};
		int b[] = { 0,0,0,0,0 };
		int s = a.length + b.length;
		int tail = a.length - 1;
		int end = b.length - 1;
		int n[] = new int[s];
		for (int i = s - 1; i >= 0; i--) {
			if (tail > -1 && end > -1) {
				if (a[tail] >= b[end]) {
					n[i] = a[tail];
					tail--;
				} else {
					n[i] = b[end];
					end--;
				}
			} else {
				if (tail < 0) {
					n[i] = b[end];
					end--;
				} else  {
					n[i] = a[tail];
					tail--;
				}
			}
		}

		for (int result : n) {
			System.out.println(result);
		}

	}
}
