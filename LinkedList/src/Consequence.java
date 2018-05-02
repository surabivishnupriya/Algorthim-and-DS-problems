import java.util.HashSet;

public class Consequence {
	public static void main(String[] args) {
		int[] a= {1,2,2,3,4,5,1,1,1,2,3,3,4,5};
		HashSet<Integer> set=new HashSet<Integer>();
		int n=a.length;
		int k=2;
		int i=1,count=1,result=0;
		System.out.println("size of the array:"+n);
		if(n>0) {
			while(i<=n) {
				while(i<n&&a[i-1]==a[i]) {
					count++;
					i++;
				}
				if(k==count) {
					if(set.contains(a[i-1])) {
					result++;
					i++;
					count=1;
					}
					else {
						set.add(a[i-1]);
						result++;
						i++;
						count=1;
					}
						
				}
				else {
					i++;
					count=1;
				}
			}
			if(result==0)
				System.out.println("No such element found");
			else
				System.out.println(set);
		}
		else
			System.out.println("Array is empty");
	}

}
