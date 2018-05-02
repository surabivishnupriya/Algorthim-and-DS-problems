
public class Splitarray {
	
	public static void main(String args[]) {
		//int a[]= {-1,-2,-3};
		int  a[]=new int[3];
		a[0]=-1;
		a[1]=-2;
		a[2]=-3;
		int sum=0;
		int i,j;
		int n=a.length;
		for( i=0;i<n;i++)
		{
			sum+=a[i];
			
		}
		System.out.println(sum);
		
	
		for(i=0;i<n;i++) {
			
			if (sum-a[i]==a[i])
			{
				System.out.println("first array"+a[i] );
				System.out.println("second array");
				for(j=0;j<n;j++)
				{
					if(j!=i)
						
						System.out.println(a[j]);
				}
				
				break;
				
			}
			
			
		
		}
		if(i==n)
		System.out.println("Array can't be splitted ");
		
	}
	
}
