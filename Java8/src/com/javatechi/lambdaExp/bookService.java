package com.javatechi.lambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bookService {

	private static ArrayList<Book> book;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDao bdao= new BookDao();
		book = bdao.getBook();
		
Collections.sort(book,(b1,b2) -> b1.getName().compareTo(b2.getName()));
		//Collections.sort(book,new MyComparator());
		System.out.println(book);
	}

	/*
	 * static class MyComparator implements Comparator<Book> {
	 * 
	 * public int compare(Book o1, Book o2) { // TODO Auto-generated method stub
	 * return o1.getName().compareTo(o2.getName()); }
	 * 
	 * 
	 * 
	 * }
	 */
}
