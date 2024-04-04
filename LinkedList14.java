import java.util.*;
class LinkedList14
{
 public static void main(String args[])
 {
  LinkedList list=new LinkedList();
  for(int i=0;i<args.length;i++)
  //Collections.sort(list);
  list.add(args[i]);
  Collections.sort(list);
  System.out.println("\n Printing the list using Iterators...");
  Iterator iter=list.iterator();
  while(iter.hasNext())
  {
    System.out.print(iter.next()+"");
  }
  System.out.println("\n Displaying the list using list Iterators...");
  ListIterator ite=list.listIterator();
  while(ite.hasNext())
  {
    System.out.println(ite.next()+"");
  }
 }
}