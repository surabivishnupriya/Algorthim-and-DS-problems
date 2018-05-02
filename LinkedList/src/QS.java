
public class QS {
	public static void main(String[] args) {
		int[] array= {1,4,6,9,2,1,444,0};
		int n=array.length;
		
		sort(array,0,n-1);
		for(int r:array)
		System.out.println(r);
		
	}
   public static void sort(int[] array,int low,int high) {
	   if(low<high) {
		   int pi=partition(array,low,high);
		   //System.out.println(pi);
		   sort(array,low,pi-1);
		   sort(array,pi+1,high);
		   
	   }
   }
	static int partition(int[] array,int low,int high) {
		int pivot=array[high];
		int i=(low-1);
		
		for(int j=low;j<high;j++) {
			if(array[j]<=pivot) {
				i++;
				int temp=array[j];
				array[j]=array[i];
				array[i]=temp;
			}
		}
		
		int temp=pivot;
		pivot=array[i+1];
		array[i+1]=temp;
		array[high]=pivot;
		return i+1;
		   
	   }
	   
   
}
