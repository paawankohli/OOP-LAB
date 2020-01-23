import java.util.Scanner;

abstract class figure
{
	int dim1, dim2;
	abstract double getArea();
}

class rectangle extends figure
{
	rectangle(int a, int b)
	{	dim1 = a;	dim2 = b;	}
	
	double getArea()
	{	return dim1 * dim2;		}
}

class triangle extends figure
{

	triangle(int a, int b)
	{	dim1 = a;	dim2 = b;	}
	
	double getArea()
	{	return 0.5 * dim1 * dim2;		}
}

class square extends figure
{
	square(int a)
	{	dim1 = a;	dim2 = a;	}
	
	double getArea()
	{	return dim1 * dim2;		}
}

class q3
{
	public static void main(String[] args) 
	{
		figure f1 = new triangle(4, 5);
		figure f2 = new rectangle(10, 7);
		figure f3 = new square(5);

		System.out.println(f1.getArea());
		System.out.println(f2.getArea());
		System.out.println(f3.getArea());
	}
}