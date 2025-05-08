package graphics;
import java.util.*;
public class rectangle{
int l,b;
double a;
Scanner sc=new Scanner(System.in);

public void area(){

System.out.println("enter the length:");
l=sc.nextInt();
System.out.println("enter the breadth:");
b=sc.nextInt();
a=l*b;
}

public void display(){

System.out.println("area of rectangle:"+a);
}

}
