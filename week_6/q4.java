import java.util.*;

class Building 
{

	float sqft;
	int stories;

	public void setFeet (float sqft) 
	{
		this.sqft = sqft;
	}

	public void setStories(int stories) 
	{
		this.stories = stories;
	}

	public int getStories() 
	{
		return stories;
	}

	public float getFeet() 
	{
		return sqft;
	}
}

class House extends Building 
{

	int nBeds;
	int nBaths;
	
	public void setBed (int nBeds) 
	{
		this.nBeds = nBeds;
	}

	public void setBath (int nBaths) 
	{
		this.nBaths = nBaths;
	}	
	
	public int getBed () 
	{
		return nBeds;
	}

	public int getBath () 
	{
		return nBaths;
	}
}


class School extends Building 
{

	int nClass;
	String grade;
	
	void setClass (int nClass) 
	{
		this.nClass = nClass;
	}

	void setGrade (String grade) 
	{
		this.grade = new String(grade);
	}

	int getnClass () 
	{
		return nClass;
	}

	String getGrade () 
	{
		return grade;
	}
}


class q4 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		Building building = new Building();
		House house = new House();
		School school = new School();

		System.out.print("Enter square footage of building: ");
		building.setFeet(sc.nextFloat());

		System.out.print("Enter stories in building: ");
		building.setStories(sc.nextInt());

		System.out.println("Building made with\nStories: " + building.getStories()  +  "\nSquare footage: " + building.getFeet());

		//		::::::::::::::::::::::::::::::::::::::::::::::::::::::

		System.out.print("Enter square footage of house: ");
		house.setFeet(sc.nextFloat());

		System.out.print("Enter stories in house: ");
		house.setStories(sc.nextInt());

		System.out.print("Enter number of bed rooms: ");
		house.setBed(sc.nextInt());

		System.out.print("Enter number of bath rooms: ");
		house.setBath(sc.nextInt());

		System.out.println("House made with\nStories: " + house.getStories()  +  "\nSquare footage: " + house.getFeet());
		System.out.println("House made with\nRoom numbers: " + house.getBed() + "\nBath room numbers: " + house.getBath());

		//		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

		System.out.print("Enter square footage of school: ");
		school.setFeet(sc.nextFloat());

		System.out.print("Enter stories in school: ");
		school.setStories(sc.nextInt());

		System.out.print("Enter number of classrooms: ");
		school.setClass(sc.nextInt());

		System.out.print("Enter level of grade :");
		sc.nextLine();
		school.setGrade(sc.nextLine());

		System.out.println("House made with\nStories: " + school.getStories()  +  "\nSquare footage: " + school.getFeet());
		System.out.println("School made with\nGrade: " + school.getGrade() + "\nNumber of classrooms: " + school.getnClass());
	}
}