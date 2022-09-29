package com.durgasoft.function;

import java.util.function.Function;

// function chaining
public class ExampleSeven {
	
	
	public static void main(String args[])
	{
		Function<String,String> f1 = str -> str.toUpperCase();
		Function<String,String> f2 = str -> str.substring(0,5);
		
		System.out.println("To uppper case");
		System.out.println(f1.apply("AnuragKumar"));
		System.out.println(" First Five Charachater");
		System.out.println(f2.apply("AnuragKumar"));
		
		System.out.println(" to uppercase and first five character");
		System.out.println(f1.andThen(f2).apply("Anuragkumar"));
	}
	
	
	

}
