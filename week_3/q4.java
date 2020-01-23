import java.util.Scanner;

class stack
{
	private int arr[], tos;

	stack()
	{
		System.out.println("\n\nCapacity of stack is 5");
		arr = new int[5];
		tos = -1;
	}

	public void display()
	{
		System.out.print("Current stack: ");
		
		for(int i = 0 ; i <= tos  ; i++)
			System.out.print(arr[i] + "  ");

		System.out.print("\n");
	}

	public void push(int x)
	{
		if(tos == 4)
		{
			System.out.println("Stack overflow");
			return;
		}
		
		tos++;
		arr[tos] = x;
	}

	public void pop()
	{
		if(tos == -1)
		{
			System.out.println("Stack underflow");
			return;
		}

		System.out.println(arr[tos] + " popped");
		tos--;
	}

}

class q4
{
	public static void main(String args[])
	{
		stack s = new stack();

		Scanner sc = new Scanner(System.in);
		int ch = 1;

		while(ch != -1)
		{
			System.out.println("\n\n1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			int ele;

			switch(ch)
			{
				case 1:
						System.out.print("Enter element to insert: ");
						ele = sc.nextInt();
						s.push(ele);
						break;

				case 2:
						s.pop();
						break;

				case 3:
						s.display();
						break;

				case 4:
						ch = -1;
						break;
			}	
		}	
	}
}