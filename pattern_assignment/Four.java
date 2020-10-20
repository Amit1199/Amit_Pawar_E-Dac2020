class Four{
public static void main(String args[])
{
	for(int i=1;i<10;i++)
	{
	 for(int j=i;j<10;j++)
	{
	System.out.print(" ");
	}
	 for(int k=1;k<=i;k++)
	{
	System.out.print(k);
	}
	for(int m=i-1;m>=1;m--)
	{
	System.out.print(m);
	}
	System.out.println();
	}
}
}