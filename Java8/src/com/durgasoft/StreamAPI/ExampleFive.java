package com.durgasoft.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

// find the minimum and maximum value from a given list
public class ExampleFive {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, 50, 44, 71, 73, 55, 46, 35, 98, 1, 23, 43));

		int l1 = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		int l2 = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();

		System.out.println("un sorted List : " + al);
		System.out.println("Min value : " + l1);
		System.out.println("Max Value: " + l2);

	}
}
