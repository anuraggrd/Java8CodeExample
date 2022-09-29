package com.durgasoft.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

// write a programme to remove empty string and null value from a given list
public class ExampleFive {
	
	
	public static void main (String args[])
	{
		String arr[] = {"rahul","Kunal","",null,"kamina","Ray",null , ""};
		
		Predicate<String> p = s ->  s != null && s.length() !=0;
		ArrayList<String>al = new ArrayList<>();
		for(String s : arr)
		{
			if(p.test(s))
			{
				al.add(s);
			}
		}
		
		System.out.println(al);
	}

	
}
