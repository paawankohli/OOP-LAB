import java.util.Scanner;

class q4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input string: ");
		String n = sc.nextLine();
		
		System.out.println("Output: ");
		
		int m = n.length();

		for(int i = 0 ; i < n.length() ; i++)
		{
			System.out.print(n.charAt(i));

			if(--m % 3 == 0 && m != 0)
				System.out.print(",");
		}

		System.out.println("\n");

	}
}