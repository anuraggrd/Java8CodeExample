package com.durgasoft.function;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

// write a program o authenicate the user
public class ExampleEight {

	public static void main(String args[])
	{
		
		ExampleEight eg = new ExampleEight();
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter user Name");
		String UserName = src.next();
		
		System.out.println("Enter Password");
		String password = src.next();
		
		Function<String,String> f1 = str -> str.toLowerCase();
		Function<String,String> f2 = str -> str.substring(0,5);
		
		
		
		  Predicate<String> p1 = str -> f1.andThen(f2).apply(str).equals("durga");
		  Predicate<String> p2 = pass -> pass.equals("java");
		 
		
		if(p1.test(UserName) && p2.test(password))
		{
			System.out.println("Valid User");
		}else
		{
			System.out.println("Invalid User");
		}
				
	}
	
	
}
