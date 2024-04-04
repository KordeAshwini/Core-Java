//import java.io.*;
import java.util.Scanner;
class Factorial
{
  public static void main(String args[])//throws IOException
  { 
     int fact=1,n,i=1;
	 //n=Integer.parseInt(args[0]);
	 System.out.println("Enter a number");
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 
	 while(i<=n)
	 {
	   fact=fact*i;
	   i++;
	 }
    System.out.println("Factorial is"+fact);
  }
}  