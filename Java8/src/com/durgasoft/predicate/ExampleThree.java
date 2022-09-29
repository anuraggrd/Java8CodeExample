package com.durgasoft.predicate;

import java.util.function.Predicate;

public class ExampleThree {
	
	
	public void m1(Predicate<Integer> p , int []arr)
	{
		
		for(int x : arr)
		{
			if(p.test(x))
			{
				System.out.print(x+ ",");
			}
		}
		System.out.print(".\n");
	}
	
	public static void main(String args[])
	{
		ExampleThree t = new ExampleThree();
		int []arr = {2,3,5,2,55,66,44,77,899,33,45,63,22};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2 == 0;
		System.out.println("numbers are greater than 10 ");
		t.m1(p1,arr);
		System.out.println("numbers not greater than 10 ");
		t.m1(p1.negate(),arr);
		System.out.println("Even numbers ");
		t.m1(p2,arr);
		System.out.println("numbers not Even numbers ");
		t.m1(p2.negate(),arr);
		System.out.println("Greater than 10 and Even numbers ");
		t.m1(p1.and(p2),arr);
		System.out.println("Not Greater than 10 and not Even numbers ");
		t.m1(p1.negate().and(p2.negate()),arr);
		System.out.println("Greater than 10 or Even numbers ");
		t.m1(p1.or(p2),arr);
	}

}
