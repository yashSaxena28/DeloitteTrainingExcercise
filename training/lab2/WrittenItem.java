package com.training.lab2;

public abstract class WrittenItem extends Item 
{
	private String author;
	
	public WrittenItem(int id,int noCopy,String title,String author)
	{
		super(id,noCopy,title);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
