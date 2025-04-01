import java.util.Scanner;

class product {
  int pcode;
  float price;  // Use float for price
  String pname; // Corrected to 'String' instead of 'string'

  void getdata() {
    System.out.println("Enter code, name, price ");
    Scanner sc = new Scanner(System.in);
    this.pcode = sc.nextInt();
    sc.nextLine(); // Consume newline
    this.pname = sc.nextLine();
    this.price = sc.nextFloat();
  }

  void display() {
    System.out.println("Product Code: " + pcode); 
    System.out.println("Product Name: " + pname);
    System.out.println("Product Price: " + price);
  }
}

public class Product {
  public static void main(String args[]) {
    product p1 = new product();
    p1.getdata();
    p1.display();

    product p2 = new product();
    p2.getdata();
    p2.display();

    product p3 = new product();
    p3.getdata();
    p3.display();

    if (p1.price < p2.price && p1.price < p3.price) {
      System.out.println("The lowest price product is: " + p1.pcode + " " + p1.pname + " " + p1.price);
    } else if (p2.price < p1.price && p2.price < p3.price) {
      System.out.println("The lowest price product is: " + p2.pcode + " " + p2.pname + " " + p2.price);
    } else {
      System.out.println("The lowest price product is: " + p3.pcode + " " + p3.pname + " " + p3.price);
    }
  }
}

