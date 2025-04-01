import java.util.*;
public class Factorial
{
  public static void main(String args[])
  {
    int a,fact=1;
    Scanner fac=new Scanner(System.in);
    System.out.println("Enter the number to find factorial");
    a=fac.nextInt();
    for(int i=1;i<=a;i++)
    {
      fact*=i;
    }
    System.out.println("factorial="+fact);
  }
}    
