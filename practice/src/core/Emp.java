package core;

public class Emp {
	int eid; String ename; double esal;
	Emp(int eid, String ename, double esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	void disp ()
	{
		System.out.println("Employee ID       "+eid);
		System.out.println("Employee Name     "+ename);
		System.out.println("Employee Salary   "+esal);
	}
	public static void main (String [] args)
	{
		Emp p1 = new Emp(111,"aaa",10000);
		Emp p2 = new Emp(112,"bbb",20000);
		Emp p3 = new Emp(113,"ccc",30000);
		Emp p4 = new Emp(114,"ddd",40000);
		Emp p5 = new Emp(115,"eee",50000);
		Emp p6 = new Emp(116,"fff",60000);
		p1.disp();
		p2.disp();
		p3.disp();
		p4.disp();
		p5.disp();
		p6.disp();
		
		
		
	}

}
