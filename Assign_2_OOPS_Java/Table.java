import java.util.*;
class Table{
public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter table of= ");
	int n=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
	int a=n*i;
	System.out.println(n+" * "+i+" = "+a);
	}
}
}