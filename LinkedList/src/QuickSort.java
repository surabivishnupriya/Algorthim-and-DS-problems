
public class QuickSort {
	 void  sort(int arr[], int low, int high)
	    {
	        int pivot; 
	       
	        int i = -1; // index of smaller element
	        for( i=low-1;i<high;i++) {
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	        	pivot=arr[high];
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	        high--;
	        
	    }
	    }
	 
	    /* The main function that implements QuickSort()
	      arr[] --> Array to be sorted,
	      low  --> Starting index,
	      high  --> Ending index */
	    
	 
	    /* A utility function to print array of size n */
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	    // Driver program
	    public static void main(String args[])
	    {
	        int arr[] = {10, 7, 8, 9, 1, 1};
	        int n = arr.length;
	 
	        QuickSort ob = new QuickSort();
	        ob.sort(arr, 0, n-1);
	 
	        System.out.println("sorted array");
	        printArray(arr);
	    }
	}