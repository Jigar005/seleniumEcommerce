/*Author: Jigar This is a example of treeset using my comparator interface in order to
 * apply customized sorting order. 1) Ascending String 2) Ascending Numerical. 
*/
package core;

import java.util.*;





class Eemp
{ String name; int nbr;
	Eemp(String name, int nbr)
	{this.name = name;
	this.nbr = nbr;
	}
	public String toString()
	{
		return " "+name +"  "+ nbr;
	}
	
}
class Ecomp implements Comparator<Eemp>
{
	public int compare(Eemp p1, Eemp p2)
	{
		String s1 = p1.name;
		String s2 = p2.name;
		return s1.compareTo(s2);
		
	}
}
class EcompNu implements Comparator<Eemp>
{
	public int compare(Eemp p1, Eemp p2)
	{
		int n1 = p1.nbr;
		int n2 = p2.nbr;
		if (n1 == n2){return 0;	}
		else if (n1 < n2){return -1;	}
		else {return +1;	}
		
	}
}
 public class MyTreSt
 {
	 public static void main (String [] args)
	 {
		 TreeSet<Eemp> sst = new TreeSet<Eemp>(new EcompNu());
		 sst.add(new Eemp("A", 500));
		 sst.add(new Eemp("B", 400));
		 sst.add(new Eemp("C", 300));
		 sst.add(new Eemp("D", 200));
		 sst.add(new Eemp("E", 100));
		 System.out.println(sst);
	 }
	 
 }
