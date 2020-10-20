import java.util.*;
class Reversal{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number: ");
	int a=sc.nextInt();
	int sum=0;
	while(a>0)
	{
	int rem=a%10;
	a=a/10;
	sum=(sum*10)+rem;
	}
	System.out.print("REverse of number= "+sum);
}
}