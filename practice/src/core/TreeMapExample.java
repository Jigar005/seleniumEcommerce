package core;

import java.util.TreeMap;

class EmpDetailsKey implements Comparable {
	int empid;

	public EmpDetailsKey(int empid) {
		this.empid = empid;}
	public String toString ()
	{
		return "Employee Number "+empid;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		EmpDetailsKey e = ((EmpDetailsKey) o);
		if (empid == e.empid) {return 0;} else if (empid > e.empid)
		{return +1;} else {return -1;}
	}
}
class EmpValue {
	String empname;
public EmpValue(String empname) {this.empname = empname;}
public String toString ()
{
	return "Employee Name "+empname;
}
}

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<EmpDetailsKey, EmpValue> treemap = new TreeMap<>();
		treemap.put(new EmpDetailsKey(1), new EmpValue("Ram")); 
		treemap.put(new EmpDetailsKey(2), new EmpValue("sam")); 
		treemap.put(new EmpDetailsKey(3), new EmpValue("tam")); 
		treemap.put(new EmpDetailsKey(4), new EmpValue("uam")); 
		treemap.put(new EmpDetailsKey(5), new EmpValue("vam")); 
		treemap.put(new EmpDetailsKey(6), new EmpValue("xam")); 
		System.out.println(treemap);
		System.out.println(treemap.isEmpty());
		System.out.println(treemap.firstKey());
		System.out.println(treemap.pollFirstEntry());
		
	}
}
