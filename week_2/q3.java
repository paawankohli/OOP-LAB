import java.util.Scanner;

class  linearSearch
{
	private int arr[], size;

	public void construct()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		size = sc.nextInt();
		arr = new int[size];

		System.out.print("Enter array elements: ");

		for(int i = 0 ; i < size ; i++)
			arr[i] = sc.nextInt();
	}

	public void search(int x)
	{
		for(int i = 0 ; i < size ; i++)
			if(arr[i] == x)
			{
				System.out.print("Element found at " + (i+1) + "th position.\n");
				return;
			}

		System.out.print("Element not found.\n");
	}
}

class q3
{
	public static void main(String args[])
	{
		System.out.print("Linear Search in Arrays: \n ");

		linearSearch obj = new linearSearch();
		obj.construct();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter element to search: ");
		int x = sc.nextInt();

		obj.search(x);
	}
}