import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
	
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
	
		}
		System.out.println("Your Array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Enter Element to search:");
		int x=sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
					if(a[i]==x)
					{
						System.out.println("Element found at "+(i+1)+" th pos");
					}
					else
						System.out.println("Element Not found");
	
		}
		
		
		sc.close();
	}
}