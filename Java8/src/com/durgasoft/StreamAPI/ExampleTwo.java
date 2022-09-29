package com.durgasoft.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//write a programm to double every element of list
public class ExampleTwo {

	public static void Traditionalway(ArrayList<Integer>l1)
	{
		List<Integer> l2 = new ArrayList<>();
		for(int x : l1)
		{
			l2.add(x*2);
		}
		
		System.out.println("Traditional Way" + l2);
	}
	
	public static void usingtreams(ArrayList<Integer> al)
	{
		
		 List<Integer> l3 = al.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("Using Streams" + l3);
		
		
	}
	
	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,50,44,71,73,55,46,35,98,1,23,43));
		Traditionalway(al);
		usingtreams(al);
	}
}
