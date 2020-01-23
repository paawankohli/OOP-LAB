import java.util.Scanner;

class Phone
{
	String brand;
	int memCapacity;

	Phone(String a, int b)
	{
		brand = new String(a);
		memCapacity = b;
	}

	interface Callable
	{
		void makeAudioCall(String cellNum);
		void makeVideoCall(String cellNum);
	}
}

class BasicPhone extends Phone implements Phone.Callable
{
	int model;

	BasicPhone(String a, int b, int c)
	{
		super(a, b);
		model = c;
	}

	public void makeAudioCall(String cellNum)
	{
		System.out.println(cellNum + " is being audio called using " + 
							brand + " " + model + " " + 
							memCapacity +" GB variant");
	}

	public void makeVideoCall(String cellNum)
	{
		System.out.println(cellNum + " can't be video called using " + 
							brand + " " + model + " " + 
							memCapacity +" GB variant");
	}
}

class SmartPhone extends Phone implements Callable
{
	int model;

	SmartPhone(String a, int b, int c)
	{
		super(a, b);
		model = c;
	}

	public void makeAudioCall(String cellNum)
	{
		System.out.println(cellNum + " is being audio called using " + 
							brand + " " + model + " " + 
							memCapacity +" GB variant");
	}

	public void makeVideoCall(String cellNum)
	{
		System.out.println(cellNum + " is being video called using " + 
							brand + " " + model + " " + 
							memCapacity +" GB variant");
	}
}

class q1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. to call: ");
		String cellNum = sc.nextLine();

		System.out.println("Enter basic phone brand, capacity and model: ");

		BasicPhone bp = new BasicPhone(sc.nextLine(), sc.nextInt(), sc.nextInt());
		
		bp.makeAudioCall(cellNum);
		bp.makeVideoCall(cellNum);

		sc.nextLine(); // to handle buffer

		System.out.println("Enter smart phone brand, capacity and model: ");

		SmartPhone sp = new SmartPhone(sc.nextLine(), sc.nextInt(), sc.nextInt());

		sp.makeAudioCall(cellNum);
		sp.makeVideoCall(cellNum);
	}
}