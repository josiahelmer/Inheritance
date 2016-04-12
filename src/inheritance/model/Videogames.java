package inheritance.model;

import java.util.ArrayList;



public abstract class Videogames implements Gaymes, Comparable
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
	
	public String toString()
	{
		String VideogamesDescription = "" + this.getClass() + "" + controls();
		
		return VideogamesDescription;
	}
	int compareTo(Object compared)
	{
		 int comparedValue = Integer.MIN_VALUE;
		 
		 if(compared instanceof SillyThing)
		 {
			 if(this.getSillinessLevel() < ((Sillything) compared).sillinessLevel())
			 {
				 comparedValue = -1;
			 }
			 else if(this.sillinessLevel() > ((SillyThing) compared).sillinessLevel())
			 {
				 comparedValue = 1;
			 }
			 else
			 {
				 comparedValue = 0;
			 }
		 }
		 
		 
		 return comparedValue;
	}
}
