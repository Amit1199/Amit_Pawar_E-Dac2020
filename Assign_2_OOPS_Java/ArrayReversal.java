import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Numbers");
		int a[]=new int[10];
		int b[]=new int [10];
		for(int i=0;i<10;i++)
		{
		a[i]=sc.nextInt();
		b[i]=a[i];
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
			}
		}
		System.out.println("\nGiven input: ");
		for(int i=0;i<10;i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println("\nReversed output: ");
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
