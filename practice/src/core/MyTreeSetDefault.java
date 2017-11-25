package core;
import java.util.*;
 class Empp implements Comparable<Empp>
 {
	 String ename; int eenum;
	 Empp(String ename, int eenum)
	 {
		 this.ename = ename;
		 this.eenum= eenum;
	 }
	 public String toString()
	 {
		 return "Employee name  "+ename + "  Employee Num  "+ eenum;
	 }
	 public int compareTo(Empp ee)
	 {
		String st1 = this.ename;
		String st2 = ee.ename;
		return st1.compareTo(st2);
	}
 }

public class MyTreeSetDefault
{
	public static void main (String [] args)
	{
		TreeSet<Empp> tts = new TreeSet<Empp>();
		tts.add(new Empp("AAA", 500));
		tts.add(new Empp("AAb", 400));
		tts.add(new Empp("AAc", 300));
		tts.add(new Empp("AAd", 200));
		tts.add(new Empp("AAz", 100));
		System.out.println(tts);
		TreeSet<Empp> tts2 = new TreeSet<Empp>();
		tts2.addAll(tts);//Adding new collection object 
		tts2.add(new Empp("jigar", 5000));
		System.out.println(tts2);
	}
}
