import java.io.*;

class RandomAccess
{
  public static void main(String arg[])throws Exception
  {
	  RandomAccessFile fobj=new RandomAccessFile("Ashwini.txt","rw");
	  fobj.writeUTF("abcdefghij");
	  fobj.seek(0);
	  System.out.println("data from file:"+fobj.readUTF());
	  fobj.seek(5);
	  fobj.writeUTF("****");
	  fobj.seek(0);
	  System.out.println("data from file:"+fobj.readUTF());
	  
	  
  }
}  