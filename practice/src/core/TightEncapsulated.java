package core;

public class TightEncapsulated 
{
	public static void main (String [] args)
	{
		EmpBin in1 = new EmpBin();
		in1.setempid(111);
		in1.setesal(10000);
		
		EmpBin in2 = new EmpBin();
		in2.setempid(222);
		in2.setesal(20000);
		
		EmpBin in3 = new EmpBin();
		in3.setempid(333);
		in3.setesal(30000);
	//Getting data from bin
		System.out.println(in1.getempid());
		System.out.println(in1.getesal());
		
		System.out.println(in2.getempid());
		System.out.println(in2.getesal());
		
		System.out.println(in3.getempid());
		System.out.println(in3.getesal());
	}	
}
class EmpBin
{private int empid; private double esal;
	public void setempid (int empid){this.empid=empid;}
	public void setesal(double esal){this.esal=esal;}
	
	public int getempid (){return empid;}
	public double getesal(){return esal;}
}
