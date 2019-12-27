package com.training.lab2;

public class Video extends MediaItem 
{
	private String director,genre;
	private int year;

	public Video(int id, int noCopy, String title, int runtime,String director,String genre,int year) 
	{
		super(id, noCopy, title, runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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
		System.out.println("Video [ id = "+this.getId()+",title = "+this.getTitle()+", number of copies = "+this.getNoCopy()+", Runtime ="+this.getRuntime()+", Director ="+this.getDirector()+", Genre ="+this.getGenre()+", Release Year ="+this.getYear()+"]\n");
	}

}