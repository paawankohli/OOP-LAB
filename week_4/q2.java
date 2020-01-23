import java.util.Scanner;

class  time
{
	private long hour = 0, min = 0, sec = 0;
	private long totalsec = 0;

	time()
	{
		hour = 11;
		min = 11;
		sec = 11;
	}

	time(int a, int b, int c)
	{
		hour = a;
		min = b;
		sec = c;
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
		time b = new time(3, 35, 17);

		time c;

		System.out.print("Addition:  ");
		c = a.add(b);
		c.display();

		System.out.print("Subtraction:  ");
		c = a.subtract(b);
		c.display();
				
		System.out.print("Comparison:  ");
		a.compare(b);
	}
}