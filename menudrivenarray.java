import java.util.*;
class menudrivenarray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String arr[]={"blue","green","yellow","orange","black","violet"};
    int choice;
    do{
      System.out.println("\n Menu:");
      System.out.println("1. Search for a string: ");
      System.out.println("2. Sort the array: ");
      System.out.println("3. exit ");
      System.out.println("Enter your choice: ");
      choice=sc.nextInt();
      sc.nextLine();
      switch(choice)
      {
        case 1:
         System.out.print("Enter a string to search: ");
         String searchstr=sc.nextLine();
         boolean found=false;
         for(String str:arr)
         {
           if(str.equalsIgnoreCase(searchstr)){
             found=true;
             break;
           }
         }
         if(found)
         System.out.println(searchstr+" found ");
         else
         System.out.println(searchstr+" not found ");    
         break;
        case 2:
         Arrays.sort(arr);
         System.out.println("Sorted array: "+Arrays.toString(arr));
         break;
        case 3:
         System.out.println("Exiting....");
         break;
        default:
         System.out.println("Invalid Option...Provide a valid option");
         break;
      }
    }
    while(choice!=3);
  }
}           
