import java.util.*;

interface Series
{
	int getNext();
	void reset();
	void setStart(int n);
}

class ByTwos implements Series
{	
	int sta;
	int cur;

	ByTwos()
	{
		sta = 0;
		cur = 0;
	}
	
	public void setStart(int n)
	{
		sta = n;
		cur = n;
	}

	public int getNext()
	{
		cur += 2;
		return cur;
	}

	public void reset()
	{
		cur = sta;
	}
}

class q4
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		ByTwos obj = new ByTwos();
		int n;

		System.out.print("Enter start: "); n = sc.nextInt(); obj.setStart(n);
		
		for(int i = 0 ; i < 10 ; i++)
			System.out.print(obj.getNext() + "    ");

		System.out.println("\n\nResetting...\n"); obj.reset();

		System.out.print("Enter start: "); n = sc.nextInt(); obj.setStart(n);
		
		for(int i = 0 ; i < 10 ; i++)
			System.out.print(obj.getNext() + "    ");

		System.out.println("\n\nExiting....\n");
	}
}