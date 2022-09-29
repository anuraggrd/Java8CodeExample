package com.defaultMethodAndAStaticMethod.defaultMethids;

interface Left
{
	default void m1()
	{
		System.out.println("This is the left interface m1 method");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("This is the Right interface m1 method");
	}
}
public class DefaultMethodAmbigutyProblem implements Left,Right {
	
	public void m1()
	{
		//System.out.println("This is over ridden method inside impemented class");
		//Left.super.m1();
		Right.super.m1();
		
	}
	
	public static void main(String args[]) {
		DefaultMethodAmbigutyProblem m = new DefaultMethodAmbigutyProblem();
		m.m1();
	}
	 
	

}
