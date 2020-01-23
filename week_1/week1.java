import java.util.Scanner;

class  comp
{
	public int largest(int x, int y, int z)
	{
		if(x > y && x > z)
			return x;

		else if(y > x && y > z)
			return y;

		else
			return z;
	}
}

class q1
{
	public static void main(String args[])
	{
		System.out.println("Enter 3 numbers: ");

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		comp c = new comp();

		System.out.println("Largest is: ");
		System.out.println(c.largest(n1, n2, n3));
	}
}

class  dis
{
	public void findRoots(float a, float b, float c)
	{
		double D = ((b * b ) - 4 * a * c);

		int ch = 0;

		if(D == 0)
			ch = 1;
		else if(D > 0)
			ch = 2;
		else if (D < 0)
			ch = 3;

		switch(ch)
		{
			case 1:
					System.out.println("Root: " + -b);
					break;

			case 2:
					D = Math.pow(D, 0.5);
					System.out.println("Root 1: " + (-b + D) / (2 * a));
					System.out.println("Root 2: " + (-b - D) / (2 * a));
					break;

			case 3:
					D = -D;
					D = Math.pow(D, 0.5);

					System.out.println("Root 1: " + (-b / (2 * a)) + " + i" + (D / (2 * a)));
					System.out.println("Root 2: " + (-b / (2 * a)) + " - i" + (D / (2 * a)));
					break;
		}
	}
}


class q2
{
	public static void main(String args[])
	{
		System.out.println("Enter 3 coeff: ");

		Scanner sc = new Scanner(System.in);

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		dis d = new dis();

		d.findRoots(a, b, c);
	}
}

class  PnC 
{
	public long fac(long n)
	{
		if(n == 1 || n ==0)
			return 1;
		else
			return n * fac(n - 1);
	}
}

class q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PnC p = new PnC();

		System.out.println("Enter number to find factoial: ");
		long a = sc.nextLong();
		System.out.println("Factorial is: " + p.fac(a));

		System.out.println("Enter n of nCr: ");
		long n = sc.nextLong();
		System.out.println("Enter r of nCr: ");
		long r = sc.nextLong();

		System.out.println( n + "C" + r + " is " + p.fac(n) / ( p.fac(r) * p.fac(n - r) ) );

	}
}

class Prime
{
	boolean isPrime(int n)
	{
		for(int i = 2; i <= n/2 ; i = i + 1)
			if(n%i == 0)
				return false;

		return true;
	}
}

class q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Prime p = new Prime();

		System.out.println("Enter number to check prime: ");
		int a = sc.nextInt();

		if(p.isPrime(a))
			System.out.println("PRIME");
		else
			System.out.println("NOT PRIME");

		System.out.println("How many prime numbers do you want: ");
		int n = sc.nextInt();

		int i = 0, j = 2;

		while(i < n)
		{
			if(p.isPrime(j))
			{
				System.out.println(j);
				i++;
			}
			j++;
		}

	}
}