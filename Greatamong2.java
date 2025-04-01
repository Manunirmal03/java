import java.util.*;
public class Greatamong2
{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner ac=new Scanner(System.in);
    System.out.println("Enter three numbers");
    a=ac.nextInt();
    b=ac.nextInt();
    c=ac.nextInt();
    if(a>b && a>c)
    {
      System.out.println(a+" is greatest among three");
    }
    else if(b>a && b>c)
    {
      System.out.println(b+" is greatest among three");
    }
    else
    {
      System.out.println(c+" is greatest among three");
    }
  }
}      
    
