package com.training.lab2;

public class Client 
{

	public static void main(String[] args) 
	{
		
		Item book=new Book(1,10,"Much Ado About Nothing","Shakespeare");
		Item jp=new JournalPaper(2,5,"Photonics and Optics","Sheldon Cooper",2016);
		Item video=new Video(3,300,"Street Dancer 3",170,"Remo","Dance",2020);
		Item cd=new CD(4,20,"Pachtaoge",3,"Arijit Singh","Heartbreak");
		
		book.checkIn();
		book.print();
		jp.print();
		video.print();
		cd.print();
		cd.checkOut();
	}

}
