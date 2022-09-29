package com.defaultMethodAndAStaticMethod.defaultMethids;

interface interfd
{
	default void m1()
	{
		System.out.println("Thus is interface default method");
	}
}

public class DefaultMethodExOne implements interfd {
	public static void main(String args[]) {
		DefaultMethodExOne  t = new DefaultMethodExOne();
		t.m1(); // we can directly use the default method inside the implemented class
	}

}
