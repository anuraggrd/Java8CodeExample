package com.durgasoft.Consumer;

import java.util.function.Consumer;

public class ExamleOne {

	
	public static void main(String argsp[])
	{
		Consumer<String> c = s-> System.out.println(s);
		
		c.accept("Hello Anurag");
		c.accept("Hi Karan");
	}
}
