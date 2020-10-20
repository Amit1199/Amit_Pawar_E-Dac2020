class HollowFullPyramid{
public static void main(String args[]){

for(int i=1;i<=6;i++)
{
  for(int j=i;j<=6;j++)
  {
      System.out.print(" ");
  }
      if(i<3 || i>5)
      {
          for(int k=1;k<=i;k++)
          {
              System.out.print("* ");
          }
          
      }
      else
      {
          System.out.print("*");
          for(int l=4;l<=(2*i);l++)
          {
              System.out.print(" ");
          }
          System.out.print("*");    
      }
      System.out.println();
  } 
}    
}