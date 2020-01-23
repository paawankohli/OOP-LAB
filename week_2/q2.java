import java.util.Scanner;

class  insertAndDelete
{
	private int arr[] = new int[20], size;

	public void construct()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		size = sc.nextInt();

		System.out.print("Enter array elements: ");

		for(int i = 0 ; i < size ; i++)
			arr[i] = sc.nextInt();

		System.out.print("\n");
	}

	public void display()
	{
		System.out.println("Current array: ");
		for(int i = 0 ; i < size ; i++)
			System.out.print(arr[i] + "  ");

		System.out.print("\n\n");
	}

	public void insert(int pos)
	{
		if(pos > size)
		{
			System.out.print("Invalid Position\n");
			return;
		}

		pos--;

		for(int i = size ; i >= pos + 1; i--)
			arr[i] = arr[i - 1];

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to be inserted: ");
		int ele = sc.nextInt();
		arr[pos] = ele;

		size++;
	}

	public void remove(int pos)
	{
		if(pos > size)
		{
			System.out.print("Invalid Position\n");
			return;
		}

		pos--;

		for(int i = pos; i < size - 1; i++)
			arr[i] = arr[i + 1];

		size--;
	}
}

class q2
{
	public static void main(String args[])
	{
		System.out.print("Inserting and Removing elements in Arrays: \n ");

		insertAndDelete obj = new insertAndDelete();
		obj.construct();

		Scanner sc = new Scanner(System.in);
		int ch = 1;

		while(ch != -1)
		{
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			int position;

			switch(ch)
			{
				case 1:
						System.out.print("Enter position to insert element: ");
						position = sc.nextInt();

						obj.insert(position);
						obj.display();
						break;

				case 2:
						System.out.print("Enter position to remove element from: ");
						position = sc.nextInt();
						
						obj.remove(position);
						obj.display();
						break;

				case 3:
						ch = -1;
						break;
			}	
		}		
	}
}