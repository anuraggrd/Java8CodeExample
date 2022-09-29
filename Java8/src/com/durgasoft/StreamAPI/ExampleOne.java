
package com.durgasoft.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// write a pogramme to chose the even numbers from a given list and put it inside another  list; 
public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,50,44,71,73,55,46,35,98,1,23,43));
		
		// Traditional way
		chooseEvenTraditionally(al);
		useingStreams(al);
		

	}
	
	public static void useingStreams(ArrayList<Integer> l)
	{
		List<Integer> l2 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("Using Stream Api");
		System.out.println(l2);
	}
	public static void chooseEvenTraditionally(ArrayList<Integer> l)
	{
		ArrayList<Integer> l1 = new ArrayList<>();
		
		for(Integer x  : l)
		{
			if(x%2 == 0)
			{
				l1.add(x);
			}
		}
		System.out.println("Traditional way");
		System.out.println(l1);
	}

}
