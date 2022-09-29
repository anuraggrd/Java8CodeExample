package com.durgasoft.predicate;

import java.util.function.Predicate;

public class ExampleFour {

	public void m1(Predicate<String> P ,String arr[])
	{
		for(String s : arr)
		{
			if(P.test(s))
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String args[])
	{
		ExampleFour f = new ExampleFour();
		String []arr = {"Kartik","Karan","Rahul","Anurag","Rohit","Keshav","Aditiya"};
		Predicate<String> p =  x -> x.charAt(0) == 'K';
		f.m1(p,arr);
	}
}
