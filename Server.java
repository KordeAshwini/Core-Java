import java.net.*;
import java.io.*;
class Server
{
  public static void main(String args[])throws Exception
  {
	  System.out.println("Server application is running...");
	  ServerSocket ssobj=new ServerSocket(2100);
	  
	  System.out.println("Server is running at port no:2100");
	  Socket s=ssobj.accept();
	  
	  System.out.println("Server and client connection is successful");
		
	  PrintStream ps=new PrintStream(s.getOutputStream());
	  
	  BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
	  BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	  
	  System.out.println("chat messanger is Started...");
	  
	  String str1,str2;
	  
	  While((str1=br2.readLine())!= null)
	  {
       System.out.println("Client says:"+str1);
	   System.out.println("Enter message for Client");
	   str2=br2.readLine();
	   ps.println(str2);
	  }	
System.out.println("Thank you for using chat messanger...");	  	  
  }
}  