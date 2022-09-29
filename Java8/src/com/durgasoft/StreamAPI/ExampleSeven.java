package com.durgasoft.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleSeven {

	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, 50, 44, 71, 73, 55, 46, 35, 98, 1, 23, 43));
		
		Integer [] arr = al.stream().toArray(Integer[] :: new);
		
		for(int x : arr)
		{
			System.out.println(x);
		}
		
		System.out.println("------------------------array-------------------------------------");
		Stream<Integer> s1 = Stream.of(arr);
		s1.filter(i -> i<50).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		
		
		System.out.println("---------------------Group of values--------------------------------");
		Stream s2 = Stream.of(9,99,9,99,999,99999,9999,999);
		s2.forEach(System.out::println);
	}
}
