package com.jigar.java.client2;
import com.jigar.java.ds.Dec;

public class Clt2 implements Dec{
public void m1(){System.out.println("m1 method client 2");}
public void m2(){System.out.println("m2 method client 2");}
public void m3(){System.out.println("m3 method client 2");}
public void m4(){System.out.println("m4 method client 2");}
public static void main (String [] args ){
	Clt2 cl2 = new Clt2();
	cl2.m1();
	cl2.m2();
	cl2.m3();
	cl2.m4();
}
}
