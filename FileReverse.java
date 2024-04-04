import java.io.*;
class FileReverse
{
  public static void main(String args[])throws IOException
  {
   FileInputStream fr=new FileInputStream("abc.txt");
   BufferedReader br=new BufferedReader(new InputStreamReader(fr));
   
   StringBuffer sb=new StringBuffer();
   String str;
   while((str=br.readLine())!=null)
   {
     System.out.println(str);
     sb.append(str);
   }
   sb.reverse();
   System.out.println(sb);   
  }
}  