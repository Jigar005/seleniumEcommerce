package jayAmbe;
public class Del
{String ename; int empid; 
Del (String ename, int empid)
{
	this.ename=ename;
	this.empid=empid;
	
}
public String toString()
{
	return ename+"  "+empid;
	
}
public static void main (String [] args)
{
	Del e1= new Del("kaak",101);
	Del e2= new Del("laak",201);
	Del e3= new Del("maak",301);
	Del e4= new Del("naak",401);
	Del e5= new Del("oaak",501);
	Del e6= new Del("paak",601);
	
	Del[] ee=new Del[6];
	
	ee[0]=e1;
	ee[1]=e2;
	ee[2]=e3;
	ee[3]=e4;
	ee[4]=e5;
	ee[5]=e6;
	
	for(Del kk:ee)
	{
		System.out.println(kk);
	}
	for (int d=0; d<ee.length;d++)
	{
		System.out.println(ee[d]);
	}
	
}
}