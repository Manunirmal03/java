import java.util.*;
public class Arithmetic
{
  public static void main(String args[])
  {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    int sum=a+b,sub=a-b,multi=a*b,div=a/b;
    System.out.println("Sum: "+sum);
    System.out.println("Substract: "+sub);
    System.out.println("Multiplication: "+multi);
    System.out.println("Division: "+div);
  }
}    
