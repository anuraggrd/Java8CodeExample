package com.durgasoft.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleSix {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, 50, 44, 71, 73, 55, 46, 35, 98, 1, 23, 43));

		//al.stream().forEach(System.out::println);
		al.stream().forEach(s -> System.out.println(s+ " : 2nd List litem"));

		

	}
}
