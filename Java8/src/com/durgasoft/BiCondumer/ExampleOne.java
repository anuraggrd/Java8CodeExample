package com.durgasoft.BiCondumer;

import java.util.function.BiConsumer;

public class ExampleOne {

	
	public static void main(String args[])
	{
		BiConsumer<String,String> c = (i1,i2) -> System.out.println(i1+i2);
		c.accept("durga","soft");
	} 
}
