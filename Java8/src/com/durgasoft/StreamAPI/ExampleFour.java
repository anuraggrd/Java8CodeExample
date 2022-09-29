package com.durgasoft.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,50,44,71,73,55,46,35,98,1,23,43));
		
		List<Integer> l1 = al.stream().sorted().collect(Collectors.toList());
		List<Integer> l2 = al.stream().sorted( (i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println("un sorted List : " + al);
		System.out.println("Default natural Sorting order : " + l1);
		System.out.println("cutomise Sorting order : " + l2);
	}

}
