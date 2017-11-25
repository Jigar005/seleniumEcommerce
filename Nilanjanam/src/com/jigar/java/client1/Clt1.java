package com.jigar.java.client1;
import com.jigar.java.hlpcls.Helper;

public class Clt1 extends Helper {
public void m2() {System.out.println("m2 method client1 class");}
public void m3() {System.out.println("m3 method client1 class");}
public void m4() {System.out.println("m4 method client1 class");}

public static void main (String [] args)
{
	Clt1 c1 = new Clt1();
	c1.m1();
	c1.m2();
	c1.m3();
	c1.m4();
	
}

}
