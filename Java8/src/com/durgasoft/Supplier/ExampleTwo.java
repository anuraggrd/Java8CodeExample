package com.durgasoft.Supplier;

import java.util.function.Supplier;
 // write a programm to pick andom name from the list
public class ExampleTwo {

	
	public static void main(String args[])
	{
		String []arr = {"Anurag","Rahul","Kunal"};
		Supplier<Integer> s  = ()-> {
			int x= (int)(Math.random() * 4);
			return x;
		};
		
		System.out.println(arr[s.get()]);
	}
}
