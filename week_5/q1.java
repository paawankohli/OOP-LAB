import java.util.Scanner;
import java.util.GregorianCalendar;

class student
{
	private int RNo;
	private String name;
	private GregorianCalendar gc;
	private short sem;
	private float gpa, cgpa;

	static int roll = 1901;

	student(String s, int dd, int mm, int yy, short semc, float gpac)
	{
		RNo = roll++;

		name = s;
		gc = new GregorianCalendar(yy, mm, dd);
		sem = semc;
		gpa = gpac;

		cgpa = gpa;
	}

	void display()
	{
		System.out.println("Roll Number: " + RNo);
		System.out.println("Name: " + name);
		System.out.println("DOB: " + gc.get(GregorianCalendar.DATE) + "." + gc.get(GregorianCalendar.MONTH) + "." + gc.get(GregorianCalendar.YEAR));
		System.out.println("Sem: " + sem);
		System.out.println("GPA: " + gpa);
		System.out.println("CGPA: " + cgpa);
	}

	static void sortSem(student arr[], int n)
	{
        for (int i = 0 ; i < n - 1 ; i++)
            for (int j = 0 ; j < n-i-1 ; j++)
                if (arr[j].getsem() > arr[j+1].getsem())
                {
                    student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	}


}

class q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String s;
		int dd, mm, yy;
		short semc;
		float gpac;

		student []arr = new student[5];

		for(int i = 0 ; i < 5; i++)
		{
			System.out.print("Enter name: ");
			s = sc.nextLine();

			System.out.print("date month year: ");
			dd = sc.nextInt();
			mm = sc.nextInt();
			yy = sc.nextInt();

			System.out.print("Semester: ");
			semc = sc.nextShort();

			System.out.print("GPA: ");
			gpac = sc.nextFloat();

			sc.nextLine(); // buffer workaround

			arr[i] = new student(s, dd, mm, yy, semc, gpac);
		}

		System.out.print("\n\n");

		for(int i = 0 ; i < 5; i++)
			arr[i].display();
	}
}