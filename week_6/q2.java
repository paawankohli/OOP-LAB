import java.util.Scanner;

class Max 
{
	public int max(int a, int b, int c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	public float max(float a, float b, float c)
	{
		return Math.max(Math.max(a, b), c);
	}
	
	public int max(int[] arr)
	{
		int m = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++)
			if(arr[i] > m)	
				m = arr[i];
		
		return m;
	}
	
	public int max(int[][] arr)
	{
		int m = arr[0][0];

		for(int i = 0 ; i < arr.length ; i++)
			for(int j = 0 ; j < arr[0].length ; j++)
				if(arr[i][j] > m)	
					m = arr[i][j];
		return m;
	}
}

public class q2 
{
	public static void main(String[] args) 
	{
		Max obj = new Max();
		Scanner sc = new Scanner(System.in);
		int o = 0;
		
		do{
			System.out.println("1. To find max of 3 Integers.");
			System.out.println("2. To find max of 3 floating point Numbers.");
			System.out.println("3. To find max Element in an Array.");
			System.out.println("4. To find max Element in a Matrix.");
			System.out.println("5. Exit");
			
			o = sc.nextInt();
			
			switch(o)
			{
				case 1:	System.out.println("Enter 3 Integers.");
						System.out.print("a : ");int a=sc.nextInt();
						System.out.print("b : ");int b=sc.nextInt();
						System.out.print("c : ");int c=sc.nextInt();
						System.out.println("Maximum of "+a+", "+b+" & "+c+" is "+obj.max(a, b, c));
						break;
						
				case 2:	System.out.println("Enter 3 floating point Numbers.");
						System.out.print("a : ");float a1=sc.nextFloat();
						System.out.print("b : ");float b1=sc.nextFloat();
						System.out.print("c : ");float c1=sc.nextFloat();
						System.out.println("Maximum of "+a1+", "+b1+" & "+c1+" is " + obj.max(a1, b1, c1));
						break;
						
				case 3:	System.out.println("Enter Number of Elements in Array.");
						int n=sc.nextInt();
						
						int[] arr=new int[n];
						
						for(int i=0; i<n; i++)
							arr[i]=sc.nextInt();
						
						System.out.println("The Maximum Element is : " + obj.max(arr));
						break;
				
				case 4:	System.out.println("Enter Number of Rows and Columns of the Matrix : ");
						int r=sc.nextInt();	int col=sc.nextInt();
						
						int[][] arr1=new int[r][col];

						System.out.println("Enter elements : ");
						
						for (int i=0; i<r; i++)
						    for (int j=0; j<col; j++)
						    	arr1[i][j]=sc.nextInt();
						
						System.out.println("Maximum of the Matrix is : " + obj.max(arr1));
						break;
			}
		}while(o!=5);
	}
}