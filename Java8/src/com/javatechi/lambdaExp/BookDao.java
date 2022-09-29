package com.javatechi.lambdaExp;

import java.util.ArrayList;

public class BookDao 
{

	public ArrayList<Book> getBook()
	{
		ArrayList<Book> al = new ArrayList<>();
		al.add(new Book(1,"RD Sharma",324));
		al.add(new Book(3,"NCERT",546));
		al.add(new Book(10,"ERT",546));
		al.add(new Book(5,"CRT",546));
		al.add(new Book(4,"E",546));
		
		
		return al;
	}
}
