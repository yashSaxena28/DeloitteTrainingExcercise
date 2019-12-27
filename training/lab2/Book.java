package com.training.lab2;

public class Book extends WrittenItem 
{
	public Book(int id,int noCopy,String title,String author)
	{
		super(id,noCopy,title,author);
	}
	
	@Override
	public void print() 
	{
		System.out.println("Book [ id = "+this.getId()+",title = "+this.getTitle()+", number of copies = "+this.getNoCopy()+", author ="+this.getAuthor()+"]\n");
	}
}
