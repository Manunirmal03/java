import java.util.*;
interface Shape
{
  void area();
  void perimeter();
}
class Circle implements Shape
{
  double radius;
  Circle(double radius)
  {
    this.radius=radius;
  }
  public void area()
  {
    double area=Math.PI*radius*radius;
    System.out.println("Area of circle: "+area);
  }
  public void perimeter()
  {
    double perimeter=2*Math.PI*radius;
    System.out.println("Perimeter of circle: "+perimeter);
  }
}
class Rectangle implements Shape
{
  double length,width;
  Rectangle(double length,double width)
  {
    this.length=length;
    this.width=width;
  }
  public void area()
  {
    double area=length*width;
    System.out.println("Area of rectangle: "+area);
  }
  public void perimeter()
  {
    double perimeter=2*(length+width);
    System.out.println("Perimeter of rectangle: "+perimeter);
  }
}
public class pgm9
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
      System.out.println("MENU");
      System.out.println("1. Area & perimeter of Circle");
      System.out.println("2. Area & perimeter of Rectangle");
      System.out.println("3. exit");
      System.out.println("Enter your choice");
      choice=sc.nextInt();
      switch(choice)
      {
        case 1:
        System.out.println("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        Circle circle=new Circle(radius);
        circle.area();
        circle.perimeter();
        break;
        case 2:
        System.out.println("Enter the length of the rectangle:");
        double length=sc.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width=sc.nextDouble();
        Rectangle rectangle=new Rectangle(length,width);
        rectangle.area();
        rectangle.perimeter();
        break;
        case 3:
        System.out.println("Exiting..");
        break;
        default:
        System.out.println("Invalid choice");
      }
    }
    while(choice!=3);
    sc.close();
  }
}          
        
        
                        
