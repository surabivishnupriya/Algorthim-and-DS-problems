import java.io.*;
public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		String string1="bbbab";
		String string2=reverse(string1);
		System.out.println(string2.length());
		int[][] a=new int[string1.length()+1][string2.length()+1];
		for(int i=0;i<=string1.length();i++) {
			for(int j=0;j<=string2.length()-1;j++) {
				if(i==0||j==0) {
					a[i][j]=0;
				}
				else if(string1.charAt(i-1)==string2.charAt(j-1)){
					a[i][j]=a[i-1][j-1]+1;
					
				}
				else {
					a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
					//System.out.println(a[i][j]);
				}
				
			}
		}
		
		for(int i=0;i<=string1.length();i++) {
			for(int j=0;j<=string2.length()-1;j++) {
				System.out.print(a[i][j] +" ");
			}
			
			System.out.println('\n');
		}
		
		int i=string1.length();
		int j=string2.length()-1;
		int lastValue=a[i][j];
		int temp=lastValue;
		System.out.println(lastValue);
		char[] lcs=new char[lastValue+1];
		lcs[lastValue]='\0';
		while(i>0&&j>0) {
			if(string1.charAt(i-1)==string2.charAt(j-1)) {
				lcs[lastValue-1]=string1.charAt(i-1);
				//System.out.println(lcs[lastValue-1]);
				i--;
				j--;
				lastValue--;
			}
			else if (a[i-1][j]>a[i][j-1])
				i--;
			else
				j--;
				
			}
		
		for(int k=0;k<=temp;k++)
		System.out.print(lcs[k]);
		
		
		
		
	}

	private static String reverse(String string1) {
		
		int n=string1.length();
		System.out.println(n);
		char[] r=new char[n+1];
		
		r[n]='\0';
		for(int i=0;i<string1.length();i++) {
			r[i]=string1.charAt(n-1);
			n--;
			//System.out.println(r[i]);
			
		}
		String string2=String.valueOf(r);
		String s=new String(r);
		System.out.println(s);
		return s;
	}
	

}
