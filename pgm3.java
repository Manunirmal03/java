import java.util.*;
class pgm3
{
  double price;
  class Processor
  {
    int noofCores;
    String pmanufacturer;
    Processor(int noofCores,String Pmanufacturer)
    {
      this.noofCores=noofCores;
      this.pmanufacturer=pmanufacturer;
    }
    void displayProcessorDetails()
    {
      System.out.println("PROCESSOR DETAILS:");
      System.out.println("No. of Cores:"+noofCores);
      System.out.println("Processor Manufacturer Name: "+pmanufacturer);
    }
  }
  
  static class RAM
  {
    int memory;
    String rmanufacturer;
    RAM(int memory,String rmanufacturer)
    {
      this.memory=memory;
      this.rmanufacturer=rmanufacturer;
    }
    void displayRamDetails()
    {
      System.out.println("RAM DETAILS:");
      System.out.println("Memory size: "+memory="GB");
      System.out.println("RAM Manufacturer Name: "+rmanufacturer);
    }
  }
  CPU(double price)
  {
    this.price=price;
  }
  void displayPrice()
  {
    System.out.println("CPU Price:"+price);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter CPU price: ");
              
            






































  class pgm3
{
 int price;
 Scanner sc=new Scanner(System.in);
 pgm3()
 {
  System.out.println("Enter the CPU price: ");
  price=sc.nextInt();
 }
 class Processor
 {
  int core;
  String manufacturer;
  Processor()
  {
   System.out.println("Enter the number of cores in CPU: ");
   core=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the manufacturer name: ");
   manufacturer=sc.nextLine();
  }
 }
 static class RAM
 {
  int memory;
  RAM()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the RAM in GB: ");
   memory=sc.nextInt();
  }
 }
 
 public static void main(String args[])
 {
  pgm3 c=new pgm3();
  pgm3.Processor p=c.new Processor();
  pgm3.RAM r=new pgm3.RAM();
  
  System.out.println("CPU price: "+c.price+"\nNumber of cores: "+p.core+"\nManufacturer name: "+p.manufacturer+"\nRAM in GB: "+r.memory);
 }
} 
  
  
