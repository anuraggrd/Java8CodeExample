package com.durgasoft.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class BollywoodMovie{
	
	String name;
	String status;
	BollywoodMovie(String name,String status)
	{
		this.name = name;
		this.status = status;
	}
}

public class ExampleThree {

	
	public static void populate(ArrayList<BollywoodMovie> ml)
	{
		ml.add(new BollywoodMovie("3Idiots","Hit"));
		/*
		 * ml.add(new BollywoodMovie("Jersy","flop")); ml.add(new
		 * BollywoodMovie("Runnway34","Hit"));
		 */
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method bmstub
		ArrayList<BollywoodMovie> al =new ArrayList<>();
		populate(al);
		
		Consumer<BollywoodMovie> c1 = bm -> System.out.println(bm.name +" Is ready to realse");
		Consumer<BollywoodMovie> c2 = bm -> System.out.println(bm.status +"  ");
		Consumer<BollywoodMovie> c3 = bm -> System.out.println(" in database ");
		
		for(BollywoodMovie bm : al)
		{
			c2.andThen(c1).andThen(c3).accept(bm);
		}

	}

}
