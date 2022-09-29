package com.durgasoft.function;

import java.util.Scanner;
import java.util.function.Function;

// Write a function to find the length of the String
public class ExampleOne {
	
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		System.out.println("Enter Test Case");
		int count = src.nextInt();
		while(count>=1) {
			System.out.println("Enter A String");
			String s =  src.next();
			Function<String,Integer> f = str->str.length();
			System.out.println("Length of String is String");
			System.out.println(f.apply(s));
			count--;
		}
	}

}
