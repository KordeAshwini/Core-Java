import java.util.*;
public class ArrayListSort
{
 public static void main(String args[])
 {
  System.out.println("Array list example...");
  ArrayList list=new ArrayList();
  for(int i=0;i<args.length;i++)
  {
    if(!list.contains(args[i]))
	list.add(args[i]);
  }	
  Collections.sort(list);
  Iterator iter=list.iterator();
  while(iter.hasNext())
  {
    String s=(String)iter.next();
    System.out.print(s+"");
  }
 }
}