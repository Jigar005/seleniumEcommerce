
//Cloneable class
package jayAmbe;

public class Test implements Cloneable{
int a =10,b=20;
static int c=100, d=200;
public static void main (String[] args) throws Exception
{
	Test t = new Test();
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(Test.c);
	System.out.println(Test.d);
	Test t1 =(Test)t.clone();
	
	t.a=800; t.b= 800; Test.c=800; Test.d=800;
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(Test.c);
	System.out.println(Test.d);
	
	System.out.println(t1.a);
	System.out.println(t1.b);
	System.out.println(Test.c);
	System.out.println(Test.d);
}
}
