package com.defaultMethodAndAStaticMethod.defaultMethids;

interface interfe{
	
	default void m1()
	{
		System.out.println("This is default method inside interface");
	}
}
public class DefaultMethodExTwo {
	public static void main(String args[])
	{
		DefaultMethodExTwo t = new DefaultMethodExTwo();
		t.m1();
		
	}
	
	public void m1()
	{
		System.out.println("we can also override  default method inside the implementing class");
	}

}
