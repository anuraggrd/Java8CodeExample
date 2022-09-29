package com.durgasoft.function;

import java.util.function.Function;

// write a function to count the number of spaces present in the 

public class ExampleThree {
	
	public static void main(String args[])
	{
		String S = "Anurag Kumar Gupta";
		
		Function<String,Integer> f = str -> str.length() - str.replaceAll(" ","").length();
		
		System.out.println(f.apply(S));
		
	}

}
