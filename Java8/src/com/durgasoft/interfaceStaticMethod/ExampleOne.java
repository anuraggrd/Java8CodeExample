package com.durgasoft.interfaceStaticMethod;

interface test{
	
	public static void m1()
	{
		System.out.println("This is static maethod inside interface");
	}
}
public class ExampleOne {
	public static void main(String args[])
	{
		test.m1(); //we can also call static method of interface fom unimplemented class by interface name and method name 
	}

}

class ExampleTwo implements test
{
	public static void main(String arg[]) {
ExampleTwo  t = new ExampleTwo();
// t.m1();  we can not call static method with object instance
// ExampleTwo.m1() ;   we can also not call static method with class name
		test.m1(); // static mehod is always call by interface name only
		
	}
}
