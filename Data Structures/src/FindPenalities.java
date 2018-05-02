import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPenalities {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		//int[] carNo = { 111, 121, 233, 888 };
		//int[] fine = { 100, 30, 20, 30 };
		int day;
		int penalities = 0;
		System.out.println("enter the date");
		day = Integer.parseInt(is.readLine());
	int size;
	System.out.println("enter size of the array");
	size = Integer.parseInt(is.readLine());
	int[] carNo = new int[size];
	int[] fine=new int[size];
	for (int j = 0; j < size;j++)
	{
		System.out.println("Enter the car no and fine");
		carNo[j] = Integer.parseInt(is.readLine());
		fine[j]=Integer.parseInt(is.readLine());
		
	}

		for (int i = 0; i < carNo.length; i++) {
			if (day % 2 == 0) {
				if (carNo[i] % 2 != 0) {
					penalities = penalities + fine[i];
				}
			} else {
				if (carNo[i] % 2 == 0) {
					penalities = penalities + fine[i];
				}
			}

		}
		System.out.println("CarNo:");
		for(int e:carNo)
		System.out.print(e+" ");
		System.out.println();
		System.out.println("fines:");
		for(int f:fine)
			System.out.print(f+" ");
		System.out.println("\n"+"total result:"+penalities);
	}
}
