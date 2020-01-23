import java.util.Scanner;

class  mixer
{
	private int arr[], size;

	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		size = sc.nextInt();
		arr = new int[size];

		System.out.print("Enter array elements: ");

		for(int i = 0 ; i < size ; i++)
			arr[i] = sc.nextInt();
	}

	public mixer mix(mixer b)
	{
		mixer temp = new mixer();
		int i = 0, j = 0, k = 0;

		temp.arr = new int[this.size + b. size];

		while(i < this.size && j < b.size)
			if(this.arr[i] == b.arr[j])
			{
				temp.arr[k++] = this.arr[i++];
				j++;
			}
			else if(this.arr[i] < b.arr[j])
				temp.arr[k++] = this.arr[i++];
			else
				temp.arr[k++] = b.arr[j++];

		while(i < this.size)
			temp.arr[k++] = this.arr[i++];

		while(j < b.size)
			temp.arr[k++] = b.arr[j++];

		temp.size = this.size + b. size;

		return temp;
	}

	public void display()
	{
		System.out.println("Sorted array: ");
		for(int i = 0 ; i < size ; i++)
			System.out.print(arr[i] + "  ");

		System.out.print("\n");
	}
}

class q3
{
	public static void main(String args[])
	{
		mixer a = new mixer();
		a.accept();

		mixer b = new mixer();
		b.accept();

		mixer c = a.mix(b);
		c.display();
	}
}