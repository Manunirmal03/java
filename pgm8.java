import java.util.*;
class Person
{
  String Name,Gender,Address;
  int Age;
  Person(String name,String gender,String address,int age)
  {
    Name=name;
    Gender=gender;
    Address=address;
    Age=age;
    System.out.println("From Person");
    System.out.println(" Name:"+Name+" Gender:"+Gender+" Address:"+Address+" Age:"+Age);
  }
}
class Employee extends Person
{
  int Empid,Salary;
  String Company_name,Qualification;
  Employee(String name,String gender,String address,int age,int empid,int salary,String company_name,String qualification)
  {
    super(name,gender,address,age);
    Empid=empid;
    Salary=salary;
    Company_name=company_name;
    Qualification=qualification;
    System.out.println("From Employee");
    System.out.println(" Name:"+Name+" Gender:"+Gender+" Address:"+Address+" Age:"+Age);
    System.out.println(" Empid:"+Empid+" Salary:"+Salary+" Compant_name:"+Company_name+" Qualification:"+Qualification);
  }
}
class Teacher extends Employee
{
  int Teacherid;
  String Subject,Department;
  Teacher(String name,String gender,String address,int age,int empid,int salary,String company_name,String qualification,int teacherid,String subject,String department)
  {
    super(name,gender,address,age,empid,salary,company_name,qualification);
    Teacherid=teacherid;
    Subject=subject;
    Department=department;
    System.out.println("From Teacher");
    System.out.println(" Name:"+Name+" Gender:"+Gender+" Address:"+Address+" Age:"+Age);
  System.out.println(" Empid:"+Empid+" Salary:"+Salary+" Compant_name:"+Company_name+" Qualification:"+Qualification);
    System.out.println(" Teacherid:"+Teacherid+" Subject:"+Subject+" Department:"+Department);
  }
}
class pgm8
{
  public static void main(String args[])
  {
    String name,gender,address,company_name,qualification,subject,department;
    int age,empid,salary,teacherid;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of Teachers:");
    int n=sc.nextInt();
    Teacher[] t= new Teacher[n];
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter name:");
    name=sc.nextLine();
    name=sc.nextLine();
    System.out.println("Enter gender:");
    gender=sc.nextLine();
    System.out.println("Enter address:");
    address=sc.nextLine();
    System.out.println("Enter age:");
    age=sc.nextInt();
    System.out.println("Enter Employee id:");
    empid=sc.nextInt();
    System.out.println("Enter Salary:");
    salary=sc.nextInt();
    System.out.println("Enter Company name:");
    company_name=sc.nextLine();
    company_name=sc.nextLine();
    System.out.println("Enter Qualification:");
    qualification=sc.nextLine();
    System.out.println("Enter Teacher id:");
    teacherid=sc.nextInt();
    System.out.println("Enter Subject:");
    subject=sc.nextLine();
    subject=sc.nextLine();
    System.out.println("Enter Department:");
    department=sc.nextLine();
    t[i]=new Teacher(name, gender, address, age, empid, salary, company_name, qualification, teacherid, subject, department);
    }
    }
}        
    
    
    
    
    
       
  
