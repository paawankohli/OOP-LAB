import java.util.Scanner;

class Distance
{
	private int feet;
	private float inch;

	Distance(int f, float i)
	{ 
		feet = f; 
		inch = i; 

		if(inch >= 12)
		{
			int n = (int)inch/12;
			feet += n;
			inch -= n*12;
		}
	}

	Distance add(Distance a)
	{
		Distance temp = new Distance(0, 0);
		temp.feet = this.feet + a.feet;
		temp.inch = this.inch + a.inch;

		if(temp.inch >= 12)
			temp = temp.adjust();

		return temp;
	}

	Distance add(Distance a, Distance b)
	{
		Distance temp = new Distance(0, 0);
		temp.feet = this.feet + a.feet + b.feet;
		temp.inch = this.inch + a.inch + b.inch;

		if(temp.inch >= 12)
			temp = temp.adjust();

		return temp;
	}

	Distance adjust()
	{
		Distance temp = this;
		int n = (int)temp.inch/12;
		temp.feet += n;
		temp.inch -= n*12;

		return temp;
	}

	void display()
	{ 
		System.out.println(this.feet + " feet " + this.inch + " inches"); 
	}

}

class ass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i; float f;

		System.out.print("Enter feet and inch of object 1: ");
		i = sc.nextInt(); f = sc.nextFloat();
		Distance obj1 = new Distance(i ,f);

		obj1.display();

		System.out.print("Enter feet and inch of object 2: ");
		i = sc.nextInt(); f = sc.nextFloat();
		Distance obj2 = new Distance(i ,f);

		obj2.display();
		
		System.out.print("Enter feet and inch of object 3: ");
		i = sc.nextInt(); f = sc.nextFloat();
		Distance obj3 = new Distance(i ,f);

		obj3.display();

		System.out.print("\n\n");

		Distance a = obj1.add(obj2);
		a.display();

		Distance b = obj1.add(obj2, obj3);
		b.display();
	}
}