import java.util.Scanner;

class counter
{
	static int objs = 0;

	counter()
	{
		objs++;
	}

	static void showCount()
	{
		System.out.println("Object count: " + objs);
	}
}

class q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch;

		while(true)
		{
			System.out.print("Enter 1 to create new object 0 to exit: ");
			ch = sc.nextInt();

			if(ch == 1)
				new counter();
			else
				break;
		}
		
		counter.showCount();
	}	
}