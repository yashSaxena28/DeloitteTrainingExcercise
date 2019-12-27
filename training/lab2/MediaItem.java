package com.training.lab2;

public abstract class MediaItem extends Item 
{
	
	private int runtime;
	
	public MediaItem(int id, int noCopy, String title,int runtime) 
	{
		super(id, noCopy, title);
		this.runtime=runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
