import java.io.*;
class CreateFile
{
  public static void main(String arg[])throws Exception
  {
    File fobj=new File("Ashwini.txt");
	if(fobj.createNewFile())
	{
	  System.out.println("File Successfully created");
	}
    else	
	{
		System.out.println("File unable created");
	}
  }
}  
	