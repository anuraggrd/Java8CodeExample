package com.javatechi.lambdaExp;

public interface FunctionalInterfaceExp {
	 
	public void m1();  // this is abstract method

	default void m2()
	{
		System.out.println("Default method One");
	}
	
	default int rollNumber()
	{
		Math.random();
		return 0;
	}
	
	default int m3()
	{
		Math.random();
		return 0;
	}
	static void staticMethods()
	{
		System.out.println("Static Mthod inside Functional Interface ");
	}

}
