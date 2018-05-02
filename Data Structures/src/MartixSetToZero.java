import java.util.Scanner;

public class MartixSetToZero {
	
public static void main(String[] args) {
	int m=3,n=3;
	int matrix[][]=new int[m][n];
	int[] row=new int[m];
	int[] col=new int[n];	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter matrix values:");
	//m=Integer.parseInt(sc.nextLine());
	//n=Integer.parseInt(sc.nextLine());
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++)
		{
			matrix[i][j]=Integer.parseInt(sc.nextLine());
		}
	}
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++)
		{
			if(matrix[i][j]==0)
			{
				row[i]=1;
				col[j]=1;
				System.out.println(matrix[i][j]);
			}
			System.out.println(matrix[i][j]);
		}
	}
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++)
		{
			if(row[i]==1||col[j]==1)
				matrix[i][j]=0;
		}
	}
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++)
		{
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println("");
	}
		
}

}
