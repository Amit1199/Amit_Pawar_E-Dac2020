class hollowPyramid
{
public static void main(String args[])
{
	for(int x=1;x<=1;x++)
        {
         for(int y=x;y<=6;y++)
         {
             System.out.print("* ");
         }
         System.out.println();
        }   
	for(int i=1;i<9;i++)
	{
         System.out.print("*");
         for(int j=i;j<=8;j++)
         {
         System.out.print(" ");
         }
         System.out.println("*");
        }
      System.out.println("**");
      System.out.println("*");
}
}