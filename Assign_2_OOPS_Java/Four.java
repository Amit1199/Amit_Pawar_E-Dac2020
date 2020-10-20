import java.util.*;
class Four{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter value of n= ");
	int sum=0;
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	int ai=i*10+2;
	sum=sum+ai;
	}
	System.out.print("Sum upto "+n+"2= "+sum);
}
}