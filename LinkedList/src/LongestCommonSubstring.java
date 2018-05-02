
public class LongestCommonSubstring {
	String s1 = "w";
	String s2 = "wa";
	int[][] a = new int[s1.length() + 1][s2.length() + 1];

	public void LCS() {
		int temp = 0;
		int count = 0;
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 || j == 0)
					a[i][j] = 0;
				else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					a[i][j] = a[i - 1][j - 1] + 1;
					temp = Math.max(a[i][j], temp);
					if (temp == a[i][j])
						count = i;
				} else
					a[i][j] = 0;
			}
		}
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int index = temp;
		System.out.println(index);
		char[] ch = new char[index + 1];

		ch[index] = '\0';

		for (int k = 0; k < temp; k++) {

			ch[index - 1] = s1.charAt(count - 1);
			index--;

			count--;
		}

		System.out.println(ch);

		return;

	}

	public static void main(String[] args) {
		LongestCommonSubstring a = new LongestCommonSubstring();
		a.LCS();

	}

}
