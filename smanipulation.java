import java.util.*;
class smanipulation
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String str1=sc.nextLine();
    System.out.println("Enter the second string: ");
    String str2=sc.nextLine();
    
    if(str1.equals(str2))
    {
      System.out.println("The string are sane.");
    }
    else
    {
      System.out.println("The Strings are not same");
    }
    String copyofstr1=str1;
    System.out.println("Copy of the first string: "+copyofstr1);
    
    int lengthofstr1=str1.length();
    int lengthofstr2=str2.length();
    System.out.println("Length of the first string: "+lengthofstr1);
    System.out.println("Length of the second string: "+lengthofstr2);
    
    String concatenatedString=str1+str2;
    System.out.println("Concatenated string: "+concatenatedString);
  }
}    
    
       
    
