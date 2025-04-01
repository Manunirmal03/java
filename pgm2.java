import java.util.*;
public class pgm2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number of rows and columns of first matrix:");
  int r1=sc.nextInt();
  int c1=sc.nextInt();
  int[][] matrix1=new int[r1][c1];
  System.out.println("Enter elements of Matrix1:");
  for(int i=0;i<r1;i++)
  for(int j=0;j<c1;j++)
    matrix1[i][j]=sc.nextInt();
  System.out.println("Enter the Number of rows and columns of second matrix:");
  int r2=sc.nextInt();
  int c2=sc.nextInt();
  int[][] matrix2=new int[r2][c2];
  System.out.println("Enter elements of Matrix2:");
  for(int i=0;i<r2;i++)
  for(int j=0;j<c2;j++)
    matrix2[i][j]=sc.nextInt();    
  if(r1==r2&&c1==c2)
  {
    int[][] sum=new int[r1][c1];
    for(int i=0;i<r1;i++)
    for(int j=0;j<c1;j++)
      sum[i][j]=matrix1[i][j]+matrix2[i][j];
    System.out.println("Matrix Addition result:");
    for(int i=0;i<r1;i++){
    for(int j=0;j<c1;j++){
      System.out.print(sum[i][j]+" ");}
     System.out.println();}
  }
  else
  {
    System.out.println("Matrix Addition not possible. Dimensions must match.");
  }
  
  if(c1==r2)
  {
    int[][] product=new int[r1][c2];
    for(int i=0;i<r1;i++)
    for(int j=0;j<c2;j++){
      product[i][j]=0;
      for(int k=0;k<c1;k++)
       product[i][j]+=matrix1[i][k]*matrix2[k][j];
    }
    System.out.println("Matrix Multiplication result:");
    for(int i=0;i<r1;i++){
    for(int j=0;j<c2;j++){
      System.out.print(product[i][j]+" ");}
     System.out.println();}
  }
  else
  {
    System.out.println("Multiplication not possible. Dimensions must match.");
  }  
  sc.close();
}} 
       
             
    
