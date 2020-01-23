import java.util.Scanner;

class  cNum
{
	private int real, imag;

	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real and imaginary part: ");
		real = sc.nextInt();
		imag = sc.nextInt();
	}

	public void display()
	{
		if(imag >= 0)
			System.out.println(real + " + i" + imag);

		else if(imag < 0)
			System.out.println(real + " - i" + -imag);
	}

	public cNum add(cNum obj)
	{
		cNum temp = new cNum();

		temp.real = this.real + obj.real;
		temp.imag = this.imag + obj.imag;

		return temp;
	}

	public cNum subtract(cNum obj)
	{
		cNum temp = new cNum();

		temp.real = this.real - obj.real;
		temp.imag = this.imag - obj.imag;

		return temp;
	}
}

class q1
{
	public static void main(String args[])
	{
		cNum a = new cNum();
		a.getData();
		cNum b = new cNum();
		b.getData();

		cNum c;

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.print("Enter 1 for adding 2 for subtracting:  ");
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
		}		
	}
}