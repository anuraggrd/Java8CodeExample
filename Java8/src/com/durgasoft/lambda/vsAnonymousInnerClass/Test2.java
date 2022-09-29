package com.durgasoft.lambda.vsAnonymousInnerClass;


// this is the example of lambda expression in comparession of Anonymous inner class

interface interfx{
	public void m1();
}
@SuppressWarnings("unused")
public class Test2 {

	int x = 888;
	
	public void m2()
	{
		interfx f = () ->
		{
			int x = 999; //  we cannot create instance variable inside lambda exp.isted we can create local variable
			System.out.println(this.x);// in lambda exp this refer to the outer class instance variable
			System.out.println(x);
		};
		f.m1();
	}
	public static void main(String args[])
	{
		Test2 t =new Test2();
		t.m2();
	}
}
