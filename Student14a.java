import java.util.*;
class Student14a
{
 public static void main(String args[])
 {
  LinkedList link=new LinkedList();	 
  for(int i=0;i<args.length;i++)
	//Collections.Sort(link);
  link.add(args[i]);
  Collections.sort(link);
  System.out.println("\n Printing the list using Iterators...");
  Iterator iter=link.iterator();
  while(iter.hasNext())
  {
    System.out.print(iter.next()+" ");
  }
  System.out.println("\n Displaying the list using list Iterators...");
  ListIterator ite=link.listIterator();
  while(iter.hasNext())
  {
    System.out.print(ite.next()+" ");
  }
 }
}