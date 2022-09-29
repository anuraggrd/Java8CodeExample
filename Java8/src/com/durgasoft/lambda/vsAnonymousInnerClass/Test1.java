package com.durgasoft.lambda.vsAnonymousInnerClass;

// This example is for Anonymous Inner class


interface Interf
{
	public void m1();

}

@SuppressWarnings("unused")
public class Test1 {

	int x =888;
	public void m2()
	{
		Interf f = new Interf()
				{
			// we can create Instance variable inside Anonymous inner class
					int x = 999;
					public void m1()
					{
						System.out.println(this.x);// this refer to the instance variable x of inner class
						System.out.println(Test1.this.x); // this refer to the instance variable x of outer class
						
					}
					
				};
				f.m1();
		
	}
	
	public static void main(String args[]) {
		
		Test1 t = new Test1();
		t.m2();
	}
	
}
