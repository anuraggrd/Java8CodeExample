package com.durgasoft.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{

	String name;
	String accter;
	String acctress;

	public Movie(String name, String accter, String acctress) {
		super();
		this.name = name;
		this.accter = accter;
		this.acctress = acctress;
	}


}
public class ExampleTwo {
	
	public static void populate(ArrayList<Movie> l)
	{
		l.add(new Movie("Bahubali","Prabhas","Tamnna"));
		l.add(new Movie("Bahubali2","Prabhas","Tamnnaah"));
		l.add(new Movie("Bahubali2","Prabhas","Anushka setthy"));
		l.add(new Movie("3 idoits","Amir Khan","Karina kappor"));
		l.add(new Movie("Bhulbhuilaiya2","Karik Aryan","Kiyarra Adani"));
	}
	public static void main(String args[])
	{
		ArrayList<Movie> al = new ArrayList<>();
		populate(al);
		
		Consumer<Movie> c = m-> System.out.println(m.name + " : " + m.accter + " : "+ m.acctress );
		
		for(Movie m: al)
		{
			c.accept(m);
		}
	}

}
