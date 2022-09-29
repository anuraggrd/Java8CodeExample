package com.durgasoft.predicate;

import java.util.Scanner;
import java.util.function.Predicate;


// check weather a number is greater than 10 or not
public class ExampleOne {
	
	public boolean m1(int n)
	{
		Predicate<Integer> p = i -> i>10;
		
		return p.test(n);
	
	}
	public static void main(String args[])
	{
		ExampleOne e = new ExampleOne();
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = src.nextInt();
		System.out.println(e.m1(n));
		
		
		/*
		 * Predicate<Integer> p = i -> i>10; 
		 * System.out.println(p.test(n));
		 */
		 
		  
		
	}

}
