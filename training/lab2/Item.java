package com.training.lab2;

public abstract class Item 
{
	private int id,noCopy;
	private String title;
	
	public Item(int id,int noCopy,String title) 
	{
		this.id=id;
		this.noCopy=noCopy;
		this.title=title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoCopy() {
		return noCopy;
	}

	public void setNoCopy(int noCopy) {
		this.noCopy = noCopy;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (noCopy != other.noCopy)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", noCopy=" + noCopy + ", title=" + title + "]";
	}
	
	public abstract void print();
	

	public void checkIn() 
	{
		System.out.println("WELCOME TO THE LIBRARY");
	}

	public void checkOut() 
	{
		System.out.println("THANKS FOR VISITING, PLEASE VISIT AGAIN");
	}

	
}
