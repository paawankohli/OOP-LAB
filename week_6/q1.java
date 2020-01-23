import java.util.Scanner;

class Person
{
	private String name, dob;
	
	Person()
	{}

	Person(String n, String m)
	{	name = n;	dob = m;	}

	void printPerson()
	{
		System.out.println("Name : " + name);
		System.out.println("Date of Birth : " + dob);
	}
	
	String getName()
	{	return name;	}
	
	String getDOB()
	{	return dob;		}
}

class CollegeGraduate extends Person
{
	private double GPA;
	private int gradYear;

	CollegeGraduate()
	{	super();	}

	CollegeGraduate(String n, String dob, double g, int y)
	{	super(n, dob);	GPA = g; gradYear = y;	}
	
	void printCollege()
	{
		printPerson();
		System.out.println("GPA : " + GPA);
		System.out.println("Year of Graduation : " + gradYear);
	}
	
	double getGPA()
	{	return GPA;		}
	
	int getgradYear()
	{	return gradYear;	}
}

class q1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = sc.nextLine();
		
		System.out.print("Date of Birth [dd/mm/yyyy]: ");
		String dob = sc.nextLine();

		System.out.print("GPA : ");
		double GPA = sc.nextDouble();

		System.out.print("Year of Graduation : ");
		int gradYear = sc.nextInt();

		System.out.print("\n\n");
		
		CollegeGraduate cg = new CollegeGraduate(name, dob, GPA, gradYear);
		cg.printCollege();
	}
}