import java.util.Scanner;

class  time
{
	private long hour = 0, min = 0, sec = 0;
	private long totalsec = 0;

	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours, mins and seconds: ");
		hour = sc.nextInt();
		min = sc.nextInt();
		sec = sc.nextInt();
	}

	public long timeToSec()
	{
		return hour*3600 + min*60 + sec;
	}

	public time secToTime(long a)
	{
		time TEMP = new time();

		TEMP.hour = a/3600;
		TEMP.min = (a - TEMP.hour*3600)/60;
		TEMP.sec = (a - TEMP.hour*3600)%60;
	
		return TEMP;
	}

	public time add(time b)
	{
		time TEMP = new time();
		TEMP = TEMP.secToTime(this.timeToSec() + b.timeToSec());
		return TEMP;
	}

	public time subtract(time b)
	{
		time TEMP = new time();
		TEMP = TEMP.secToTime(this.timeToSec() - b.timeToSec());
		return TEMP;
	}

	public void compare(time b)
	{
		if(this.timeToSec() == b.timeToSec())
			System.out.println("Equal. ");
		else if(this.timeToSec() > b.timeToSec())
			System.out.println("First is more. ");
		else
			System.out.println("Second is more. ");
	}

	void display()
	{
		System.out.println(hour + " : " + min + " : " + sec);
	}
}

class q2
{
	public static void main(String args[])
	{
		time a = new time();
		a.getData();
		time b = new time();
		b.getData();

		time c;

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.print("Enter 1 for adding 2 for subtracting 3 for comparing:  ");
		ch = sc.nextInt();

		switch(ch)
		{
			case 1:
					c = a.add(b);
					c.display();
					break;

			case 2:
					c = a.subtract(b);
					c.display();
					break;

			case 3:
					a.compare(b);
					break;
		}		
	}
}