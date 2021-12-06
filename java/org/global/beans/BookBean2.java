package org.global.beans;

public class BookBean2 {
//field 4개
	//자바 빈 규칙 : 무조건 private으로 field작성
	//기본생성자와 getter,setter 반드시 필요
	private String bookid;
	private String bookname;
	private String publisher;
	private int price;
	public BookBean2() {
		// TODO Auto-generated constructor stub
	}
	public BookBean2(String bookid,String bookname,String publisher,int price) {
		// TODO Auto-generated constructor stub
		this.bookid=bookid;
		this.bookname=bookname;
		this.publisher=publisher;
		this.price=price;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
