//importing adapter class of interface from another package and implementing 


package core;
import com.java.core.pack.Adapt;

class Client11 extends Adapt
{
	public void tt1(){System.out.println("tt1 client11");}
	public void tt2(){System.out.println("tt2 client11");}
	public void tt3(){System.out.println("tt3 client11");}
}

class Client22 extends Client11
{
	public void tt4(){System.out.println("tt1 client22");}
	public void tt5(){System.out.println("tt2 client22");}
	
}

public class Pack1 extends Client22
{
	public static void main (String [] args)
	{
		Pack1 k1 = new Pack1();
		k1.tt1();
		k1.tt2();
		k1.tt3();
		k1.tt4();
		k1.tt5();
		
		
	}
}
