package jayAmbe;

public class Emp {
int empid; String ename; double esal;
static String company = "Apple";

void disp () 
{
	System.out.println("Employee Name   - "+ename);
	System.out.println("Employee id     - "+empid);
	System.out.println("Employee salary - "+esal);
	System.out.println("company  Name   - "+company);
}
Emp(int empid, String ename, double esal)
{
	this.empid = empid;
	this.ename = ename;
	this.esal = esal;
	
}



public static void main (String [] args )
{
	Emp e = new Emp(101,"jigar",10000);
	Emp e1= new Emp(201,"chandni",20000);
	e.disp();
	e1.disp();
	
	
	
	
}

}
