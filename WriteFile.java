import java.io.*;
class WriteFile
{
  public static void main(String arg[])throws Exception
  {
    FileOutputStream fobj=new FileOutputStream("Ashwini.txt");
	String str= "My name is Ashwini Korde";
	byte Arr[]=str.getBytes();
	fobj.write(Arr);
	fobj.close();
  }
}  