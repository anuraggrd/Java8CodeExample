package com.javatechi.lambdaExp;

public class Book 
{

	private int bookId;
	private String name;
	private int pageNo;
	
	public Book(int bookId,String name,int pageNo)
	{
		this.bookId = bookId;
		this.name = name;
		this.pageNo = pageNo;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", pageNo=" + pageNo + "]";
	}
}
