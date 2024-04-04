import java.util.*;
class Collection1
{
   public static void main(String arg[])
   {
     Hashtable <String,Integer>lobj=new Hashtable<String,Integer>();
	 lobj.put("C programming",115);
	 lobj.put("c++",130);
	 lobj.put("java",170);
	 lobj.put("python",150);
	 System.out.println("book price is:"+lobj.get("java"));
	 lobj.remove("c++");
	   Enumeration eobj=lobj.keys();
	   while(eobj.hasMoreElements())
	   {
	   System.out.println("Elements are:"+eobj.nextElement());
	   }
    }
}	