import java.util.Scanner;

class  cNum
{
	private int real, imag;

	cNum()
	{
		real = 0;
		imag = 0;
	}

	cNum(int a, int b)
	{
		real = a;
		imag = b;
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
		cNum b = new cNum(2, 3);

		cNum c;

		System.out.print("Addition:  ");
		c = a.add(b);
		c.display();
		
		System.out.print("Subtraction:  ");
		c = a.subtract(b);
		c.display();	
	}
}