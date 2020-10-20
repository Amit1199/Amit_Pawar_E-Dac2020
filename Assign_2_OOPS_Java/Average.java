import java.util.*;
class Average{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int a[]=new int[10];
	System.out.println("enter numbers ");
	for(int i=0;i<10;i++)
	{
	a[i]=sc.nextInt();
	sum=sum+a[i];
	}
	double avg=sum/10;
	System.out.println("Sum= "+sum);
	System.out.print("Average= "+avg);
}
}