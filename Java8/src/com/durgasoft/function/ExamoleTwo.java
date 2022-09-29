package com.durgasoft.function;

import java.util.function.Function;

/// Write a function to remove the blank spaces present in the given String
public class ExamoleTwo {

	public static void main(String args[])
	{

		String str = "Anurag Kumar Gupta";

		Function<String, String> f = s -> s.replaceAll(" ", "");

		System.out.println(f.apply(str));

	}
}


