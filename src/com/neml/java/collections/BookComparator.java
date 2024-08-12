package com.neml.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BookComparator {

	public static void main(String[] args) {
		
		List<BookModel> ls = new ArrayList<BookModel>();
		ls.add(new BookModel("The Fucker","Balu D'Rocker",100));
		ls.add(new BookModel("The Sucker","NiruT",150));
		ls.add(new BookModel("The Hooker","Sa's",500));
		ls.add(new BookModel("The Kisser","Belvis McFlaken",950));
		
		Collections.sort(ls,new PriceComparator());
		
		Iterator<BookModel> it = ls.iterator();
		while(it.hasNext()) {
		
			BookModel bm = it.next();
			System.out.println("Title : " + bm.getTitle() +" | Author : "+ bm.getAuthor()+ " | Price : " +bm.getPrice());
		}
	}

}

class BookModel{
	
	private String title;
	private String author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BookModel(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}	
}

class PriceComparator implements Comparator<BookModel>{

	@Override
	public int compare(BookModel ob1,BookModel ob2) {
		
		if(ob1.getPrice() < ob2.getPrice()) {
			return 1;
		}else if(ob1.getPrice() == ob2.getPrice()) {
			return 0;
		}else {
			return -1;
		}
	}


}