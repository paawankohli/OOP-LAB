import java.util.Scanner;

class  bubbleSort
{
	private int arr[], n;

	public void construct()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		
		n = sc.nextInt();

		arr = new int[n];

		System.out.print("Enter array elements: ");

		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
	}

	public void ascend()
	{
		int temp;

		for(int i = 0 ; i < n - 1 ; i++)
			for(int j = 0 ; j < n - 1 - i ; j++)
				if(arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		System.out.println("Sorted array: ");
		for(int i = 0 ; i < n ; i++)
			System.out.print(arr[i] + "  ");

		System.out.print("\n");
	}

	public void descend()
	{
		int temp;

		for(int i = 0 ; i < n - 1 ; i++)
			for(int j = 0 ; j < n - 1 - i ; j++)
				if(arr[j] < arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		System.out.println("Sorted array: ");
		for(int i = 0 ; i < n ; i++)
			System.out.print(arr[i] + "  ");

		System.out.print("\n");
	}
}

class q1
{
	public static void main(String args[])
	{
		System.out.print("Bubble Sort: \n ");

		bubbleSort bs = new bubbleSort();
		bs.construct();

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.print("Enter 1 for ascending 2 for descending: \n ");
		ch = sc.nextInt();

		switch(ch)
		{
			case 1:
					bs.ascend();
					break;

			case 2:
					bs.descend();
					break;
		}		
	}
}