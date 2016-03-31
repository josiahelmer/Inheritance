package inheritance.model;

import java.util.ArrayList;



public abstract class Videogames implements Gaymes
{
	private ArrayList<String> controls;
	private String graphics;
	private boolean goodquality;
	
	
	
	public ArrayList<String> controls()
	{
		return controls;
		
	}
	public void setcontrols(ArrayList<String> controls)
	{
		this.controls = controls;
	}
	
	public String getgraphics()
	{
		return graphics;
	}
	public boolean getgoodquality()
	{
		return goodquality;
	}
}
