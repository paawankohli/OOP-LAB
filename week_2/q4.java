import java.util.Scanner;

class  matrice
{
	private int mat[][], row, col;

	public void construct()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrice order: ");
		row = sc.nextInt();
		col = sc.nextInt();
		mat = new int[row][col];

		System.out.print("Enter matrice elements: \n");

		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col ; j++)
				mat[i][j] = sc.nextInt();
	}

	public void add(matrice A, matrice B)
	{
		if(A.row != B.row || A.col != B.col)
		{
			System.out.print("Matrices of different order\n");
			return;
		}

		this.row = A.row;
		this.col = A.col;
		
		mat = new int[this.row][this.col];

		for(int i = 0 ; i < this.row ; i++)
			for(int j = 0 ; j < this.col ; j++)
				this.mat[i][j] = A.mat[i][j] + B.mat[i][j];
	}

	public void display()
	{
		System.out.println("Current Matrice: ");

		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < col ; j++)
				System.out.print(mat[i][j] + "\t");

			System.out.print("\n");
		}

		System.out.print("\n");
	}
}

class q4
{
	public static void main(String args[])
	{
		System.out.print("Matrice Addition in Arrays: \n ");

		matrice a = new matrice();
		a.construct();
		matrice b = new matrice();
		b.construct();

		matrice c = new matrice();
		c.add(a, b);
		c.display();
	}
}