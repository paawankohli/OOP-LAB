import java.util.Scanner;

class CurrentDate
{
	private int day;
	private int month;
	private int year;

	CurrentDate(int d, int m, int y) throws InvalidDayException
	{
		day = d;
		month = m;
		year = y;

		boolean valid = true;
		int max = 0;
		
		switch(m)
		{
			case 1: 	max = 31;
						break;

			case 2: 	if(y%4 == 0 && y % 400 != 0)
							max = 29;
	
						else
							max = 28;
		
						break;
	
			case 3: 	max = 31;
						break;
			
			case 4: 	max	= 30;
						break;
			
			case 5: 	max	= 31;
						break;

			case 6: 	max	= 30;
						break;

			case 7: 	max = 31;
						break;
			
			case 8: 	max = 31;
						break;
			
			case 9: 	max = 30;
						break;
			
			case 10: 	max = 31;
						break;
			
			case 11: 	max = 30;
						break;
			
			case 12: 	max = 31;
						break;
			
			default:	valid = false;

		}

		if(d > max)
			throw new InvalidDayException(d, m, y);
	}

	public String toString()
	{
		return "Date: " + day + "/" + month + "/" + year;
	}
}

class InvalidDayException extends Exception
{
	private int day;
	private int month;
	private int year;

	InvalidDayException(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}

	public String toString()
	{
		return "You have entered " + "Date: " + day + "/" + month + "/" + year + "\nPlease Enter valid date\n";
	}
}

class q2
{
	public static void main(String[] args) 
	{
		int d, m, y, opt;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter date, month and year");
		d = scan.nextInt();
		m = scan.nextInt();
		y = scan.nextInt();
		
		try
		{
			CurrentDate c = CurrentDate(d, m, y);
			System.out.println(c.toString());
		}

		catch(InvalidDayException i)
		{
			System.out.println(i.toString());
		}
	}
}