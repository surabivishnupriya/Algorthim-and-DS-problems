
public class editDistance {
	public static void main(String[] args) {
		String string1="saturday";
		String string2="sunday";
		int temp=0;
		int[][] a=new int[string1.length()+1][string2.length()+1];
		for(int i=0;i<=string1.length();i++) {
			for(int j=0;j<=string2.length();j++) {
				if(i==0) {
					a[i][j]=j;
				}
				else if(j==0) {
					a[i][j]=i;
				}
				else if(string1.charAt(i-1)==string2.charAt(j-1))
					a[i][j]=a[i-1][j-1];
				else {
				temp = Math.min(a[i-1][j],a[i][j-1]);
					a[i][j]=Math.min(temp,a[i-1][j-1])+1;
				}
			}
		}
		for(int i=0;i<=string1.length();i++) {
			for(int j=0;j<=string2.length();j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
