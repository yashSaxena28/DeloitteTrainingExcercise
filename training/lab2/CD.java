package com.training.lab2;

public class CD extends MediaItem 
{
	private String artist,genre;

	public CD(int id, int noCopy, String title, int runtime,String artist,String genre) {
		super(id, noCopy, title, runtime);
		this.artist=artist;
		this.genre=genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void print() 
	{
		System.out.println("CD [ id = "+this.getId()+",title = "+this.getTitle()+", number of copies = "+this.getNoCopy()+", Runtime ="+this.getRuntime()+", Artist ="+this.getArtist()+", Genre ="+this.getGenre()+"]\n");
	}

}
