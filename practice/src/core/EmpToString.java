//Example of overriding of toString method of java.lang package, so can print content by using only object 


package core;

public class EmpToString {
	String ename; int empid; double esal; 
	
	EmpToString(String ename, int empid, double esal)
	{	this.ename = ename;
		this.empid = empid;
		this.esal = esal;
		}
	public String toString()
	{
		return "nam  "+ename+"   id number  "+empid+"   pagar  "+esal;
	}
	public static void main (String [] args)
	{
		EmpToString ng1 = new EmpToString("aaa",111,10000);
		EmpToString ng2 = new EmpToString("bbb",222,20000);
		EmpToString ng3 = new EmpToString("ccc",333,30000);
		EmpToString ng4 = new EmpToString("ddd",444,40000);
		EmpToString ng5 = new EmpToString("fff",555,50000);
		System.out.println(ng1);
		System.out.println(ng2);
		System.out.println(ng3);
		System.out.println(ng4);
		System.out.println(ng5);
		
	}
}
