package inheritance.controller;

import inheritance.model.*;
import java.util.ArrayList;

public class InheritanceController
{
	private ArrayList<SillyThings> sillyThingsList;

	public InheritanceController()
	{
		sillyThingsList = new ArrayList<SillyThing>();
		
		setupSillyList();
	}
	
	private void setupSillyList()
	{
		
	}
	public String showInterfaceStuff()
	{
		String interfaceInfo = "";
		
		for(SillyThing currentSilly : sillyThingsList)
		{
			interfaceInfo.concat("The current silly thing is a " + currentSilly.toString());
			interfaceInfo.concat("\n" + "ad it has a silly level of" + currentSilly.sillinessLevel());
		}
		
		return interfaceInfo;
	}
}
