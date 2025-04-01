import java.util.*;
public class Factorialwhile
{
  public static void main(String args[])
  {
    int a,fact=1,i=1;
    Scanner fac=new Scanner(System.in);
    System.out.println("Enter the number to find factorial");
    a=fac.nextInt();
    while(i<=a)
    {
      fact*=i;
      i++;
    }  
    System.out.println("factorial="+fact);
  }
}    
