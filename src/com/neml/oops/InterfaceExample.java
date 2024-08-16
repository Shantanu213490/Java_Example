package com.neml.oops;

interface IPrintable {
	public void print();
}

class Document implements IPrintable {

	private String document;

	public Document(String document) {
		super();
		this.document = document;
	}

	@Override
	public void print() {
		System.out.println("Print Document : " + document);
	}

}

class Image implements IPrintable {

	private String image;

	public Image(String image) {
		super();
		this.image = image;
	}

	@Override
	public void print() {
		System.out.println("Print Image : " + image);
	}

}

public class InterfaceExample {

	public static void main(String[] args) {

		IPrintable[] iPrintables = new IPrintable[4];
		iPrintables[0] = new Document("Doc1.doc");
		iPrintables[1] = new Image("img07.jpeg");
		iPrintables[2] = new Document("nature.doc");
		iPrintables[3] = new Image("Sun.jpg");

		for (IPrintable printable : iPrintables) {
			printable.print();
		}

	}

}
//Question 6: Interface
//Write a Java program to demonstrate interfaces.
//Create an interface IPrintable with a method print().
//Create two classes Document and Image that implement the IPrintable interface.
//Provide an implementation for the print() method in each class.
//Create an array of IPrintable objects and store instances of Document and Image in it.
//Iterate through the array and call the print() method on each object.