import java.io.*;
class Copy
{
  public static void main(String args[])throws IOException
  {
   FileInputStream fin=new FileInputStream("Copy.java");
   FileOutputStream fout=new FileOutputStream("M.txt");
   int i=0;
   while((i=fin.read())!=-1)
   {
     if(Character.isUpperCase((char)i))
	   i=Character.toLowerCase((char)i);
    else if(Character.isLowerCase((char)i))
	   i=Character.toUpperCase((char)i);
    else if(Character.isDigit(i))
    i='*';
	fout.write(i);
   }
   System.out.println("successful");
   fin.close();
  }
}  