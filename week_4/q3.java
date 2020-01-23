import java.util.Scanner;

class account
{
	private String name;
	private int accountNo;
	private String accountType; //S or C
	private int balance;

	static int rateOfInterest = 7;
	static int id = 1000;


	account()
	{
		name = "Not assigned!";
		accountNo = id++;
		accountType = "Not assigned!";
		balance = 0;
	}

	account(String s, String type, int bal)
	{

		name = s;
		accountNo = id++;
		accountType = type;
		balance = bal;
	}

	public void display()
	{
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Account No: " + accountNo);
		System.out.println("Account Type: " + accountType);
		System.out.println("Balance: " + balance);
		System.out.println();
	}

	public void displayROI()
	{
		System.out.println("Rate of Interest: " + rateOfInterest + "%");
	}


	public void deposit(int x)
	{
		balance = balance + x;
		System.out.println(x + " desposited!");
		System.out.println("Current balance: " + balance);
	}

	public void withdraw(int x)
	{
		if(x > balance)
		{
			System.out.println("Can't withraw not enough balance!");
			return;
		}

		balance = balance - x;
		System.out.println(x + " withdrawn!");
		System.out.println("Current balance: " + balance);
	}
}

class q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		account a1 = new account("Paawan", "Savings", 7000);
		account a2 = new account();

		a1.display();
		a2.display();

		int ch = 1;

		while(ch != -1)
		{
			System.out.println("\n\n1. Desposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display");
			System.out.println("4. Display Rate of Interest");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			int x;

			switch(ch)
			{
				case 1:
						System.out.print("Enter account to desposit: ");
						x = sc.nextInt();
						a1.deposit(x);
						break;

				case 2:
						System.out.print("Enter account to withdraw: ");
						x = sc.nextInt();
						a1.withdraw(x);
						break;

				case 3:
						a1.display();
						break;

				case 4:
						account.displayROI();
						break;

				case 5:
						ch = -1;
						break;
			}	
		}	
	}	
}