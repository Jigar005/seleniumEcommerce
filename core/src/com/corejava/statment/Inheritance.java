package com.corejava.statment;
/*Author Jigar Mehta
 * Example of hierarchical inheritance
 * 
 */

class A {
	public void a() {
		System.out.println("Class A Mehtod");
	}
}

class B extends A {
	public void b() {
		System.out.println("Class B Mehtod");
	}
}

class C extends A {
	public void c() {
		System.out.println("Class C Mehtod");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b.a(); // accessing method of class a by using object of class b
		b.b(); // accessing same class method
		c.a(); // accessing method of class a by using object of class b
		c.c(); // accessing same class method
	}
}
