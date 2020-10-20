import java.util.*;
class Prime{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter 1st number:");
	int m=sc.nextInt();

	System.out.print("Enter 2nd number:");
	int n=sc.nextInt();

	int count=0;
	for(int j=m;j<=n;j++)
	{
	for(int i=1;i<=j;i++)
	{
		if(j%i==0)
		{
		count++;
		}
	}
	}

	if(count==2)
	{
	
	System.out.println(j);
	}
	
}
}