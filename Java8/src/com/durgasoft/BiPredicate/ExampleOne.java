package com.durgasoft.BiPredicate;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ExampleOne {
	
	public static void main(String args[])
	{
		BiPredicate<Integer,Integer> p = (i1,i2) -> i1>i2 ;
		
		System.out.println(p.test(20,10));
		System.out.println(p.test(10,15));
		
		
		Predicate<Integer> p2 =i-> i%2 == 0;
		System.out.println(p2.test(20));
		
		// primitive type of Predicate Function
		IntPredicate p3  = i -> i%2 !=0;
		System.out.println(p2.test(20));
	}

}
