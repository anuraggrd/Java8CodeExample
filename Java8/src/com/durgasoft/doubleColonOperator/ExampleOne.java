package com.durgasoft.doubleColonOperator;
interface Test
{
	
	public void m1();
}
public class ExampleOne {

	public static void main(String args[])
	{
		ExampleOne exO  = new ExampleOne(); 
		
		//Test t = ExampleOne::m2;
		
		Test t = exO::m3;
		
		t.m1();
		
	}
	public static void m2()
	{
		
		System.out.println("This is the implementation of m2 method");
	}
	
	public void m3()
	{
		System.out.println("This is method 3 implementation");
	}
}
