package com.durgasoft.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleThree {

	// write a programm to amke a list of Strings having length grreater than 6
	
	public static void main(String[] args) 
	{
		ArrayList<String> lst = new ArrayList<>(Arrays.asList("Pawan","RaviTeja","NagaArjun","Venkatesh","Malyaagiri"));
		
		List<String> flst = lst.stream().filter(s -> s.length() >=6).collect(Collectors.toList());
		List<String> mlst = lst.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		long frequency = lst.stream().filter(s -> s.length() >=6).count();
		System.out.println("Filter ng length greater than equalto 6 : "+ flst );
		System.out.println("Map : "+ mlst );
		System.out.println("Number of elements having length greater than equalto 6 : "+ frequency );
	}

}
