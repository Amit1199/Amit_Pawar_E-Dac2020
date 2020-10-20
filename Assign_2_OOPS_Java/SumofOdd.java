
import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		
		}
		
		for(int i=0;i<n;i++)
		{
					if(a[i]%2==0)
					{
						sum1=sum1+a[i];
					}
					else
						sum2=sum2+a[i];
	
		}
		System.out.print("Your Array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("\nAddition of even numbers: "+sum1);
		
		System.out.println("\nAddition of odd output: "+sum2);
		
		sc.close();
	}
}