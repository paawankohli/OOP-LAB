import java.util.Scanner;
import java.util.GregorianCalendar;
import java.lang.Exception;

class SeatsFilledException extends Exception
{
		private int reg;

		SeatsFilledException(int reg)
		{
			this.reg = reg;
		}
		
		public String toString()
		{
			return "Invalid Registration Number " + reg;
		}
}

class student
{
	private int RNo;
	private String name;
	private GregorianCalendar gc;

	static int roll = 1901;

	student(String s, int dd, int mm, int yy) throws SeatsFilledException
	{
		RNo = roll++;

		if (RNo%100 > 3)
			throw new SeatsFilledException(RNo);

		name = s;
		gc = new GregorianCalendar(yy, mm, dd);
	}

	void display()
	{
		System.out.println("Roll Number: " + RNo);
		System.out.println("Name: " + name);
		System.out.println("DOB: " + gc.get(GregorianCalendar.DATE) + "." + gc.get(GregorianCalendar.MONTH) + "." + gc.get(GregorianCalendar.YEAR));
	}
}

class q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String s;
		int dd, mm, yy;

		student []arr = new student[5];

		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.print("Enter name: ");
			s = sc.nextLine();

			System.out.print("date month year: ");
			dd = sc.nextInt();
			mm = sc.nextInt();
			yy = sc.nextInt();

			sc.nextLine(); // buffer workaround

//        	:::::::::::::::::::::::::::::::::::::::::::
			try
			{
				arr[i] = new student(s, dd, mm, yy);

				System.out.print("\n");
				System.out.println(":::::::::::::::::::::::::");
				arr[i].display();
				System.out.println(":::::::::::::::::::::::::");
				System.out.print("\n");
			}

			catch(SeatsFilledException e)
			{
				e.printStackTrace();
			}
//			:::::::::::::::::::::::::::::::::::::::::::
		}
	}
}