package com.training.lab2;

public class JournalPaper extends WrittenItem 
{
	private int year;
	
	public JournalPaper(int id, int noCopy, String title, String author,int year) 
	{
		super(id, noCopy, title, author);
		this.year=year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void print() 
	{
		System.out.println("Journal Paper [ id = "+this.getId()+",title = "+this.getTitle()+", number of copies = "+this.getNoCopy()+", author = "+this.getAuthor()+", Publisher Year = "+this.getYear()+"]\n");
	}

}
