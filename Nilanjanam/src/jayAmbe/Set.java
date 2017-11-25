//Employee bin concept by using setters and getters methods




package jayAmbe;
public class Set
{public static void main (String [] args)
	{
		Empbin empp1 = new Empbin();
		empp1.setempid(111);
		empp1.setempname("AAA");
		empp1.setempsal(10000);
		
		Empbin empp2 = new Empbin();
		empp2.setempid(222);
		empp2.setempname("BBB");
		empp2.setempsal(20000);
		
		Empbin empp3 = new Empbin();
		empp3.setempid(333);
		empp3.setempname("CCC");
		empp3.setempsal(30000);
		
		Empbin empp4 = new Empbin();
		empp4.setempid(444);
		empp4.setempname("DDD");
		empp4.setempsal(40000);
		
		Empbin empp5 = new Empbin();
		empp5.setempid(555);
		empp5.setempname("EEE");
		empp5.setempsal(50000);
//getting value and store in variables then printing for emp1 only
		int eno = empp1.getempid();
		System.out.println(eno);
		String ena = empp1.getempname();
		System.out.println(ena);
		double ens = empp1.getempsal();
		System.out.println(ens);
//getting value to direct sysout and printing without storing it
		System.out.println("E2 ID     :-"+empp2.getempid()+" "+empp3.getempid());
		System.out.println("E2 Name   :-"+empp2.getempname());
		System.out.println("E2 Salary :-"+empp2.getempsal());
		
		System.out.println("E3 ID     :-"+empp3.getempid());
		System.out.println("E3 Name   :-"+empp3.getempname());
		System.out.println("E3 Salary :-"+empp3.getempsal());
		
		System.out.println("E4 ID     :-"+empp4.getempid());
		System.out.println("E4 Name   :-"+empp4.getempname());
		System.out.println("E4 Salary :-"+empp4.getempsal());
		
		System.out.println("E5 ID     :-"+empp5.getempid());
		System.out.println("E5 Name   :-"+empp5.getempname());
		System.out.println("E5 Salary :-"+empp5.getempsal());
		
	}
	
}
class Empbin{
	private int empid; private String empname; private double empsal;
//setters methods
	public void setempid(int empid){this.empid= empid;}
	public void setempname(String empname){this.empname=empname;}
	public void setempsal(double empsal){this.empsal=empsal;}
//getters methods
	public int getempid(){return empid;}
	public String getempname(){return empname;}
	public double getempsal(){return empsal;}
	
}