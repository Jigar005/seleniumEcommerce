//Author <Jigar> This is a pure example of type casting in two way.


package core;
class Ppp{
	void p (){System.out.println("parent method ");}
}
class Ccc extends Ppp{
	void c (){System.out.println("child method ");}
	
}

public class TypeCasting {
	public static void main (String [] args)
	{// Parents skills(ref variable) can hold child's children(Object), but
	//	not vice versa.
		Ppp ppp = new Ccc();
		ppp.p();
		((Ccc)(ppp)).c();//type casting for this line only, from nextline 
//		object ppp will be as it is.
		Ccc c1 = ((Ccc)(ppp));//type casting for ever from nextline the "c1"
//		can call all parent and child class methods
		c1.c();
		c1.p();
		ppp.p();//But again original obj will be as it was.

		
	}
	
}
