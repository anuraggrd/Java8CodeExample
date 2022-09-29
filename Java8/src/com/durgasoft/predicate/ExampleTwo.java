package com.durgasoft.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@SuppressWarnings("resource")
public class ExampleTwo {
	
	public static void main(String args[])
	{
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter how many times you want to test");
		int count =src.nextInt();
		while(count>=1) {
			System.out.println("Enter a String");
			String s = src.next();
			Predicate<String> p = i -> i.length()>5;

			System.out.println(p.test(s));
			count--;
		}
	
	}

}
